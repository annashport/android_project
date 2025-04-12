package com.example.myyyyapplication.presentation.fragments

import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.myyyyapplication.R
import com.example.myyyyapplication.presentation.viewmodel.MapViewModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import org.koin.androidx.viewmodel.ext.android.viewModel


class MapFragment : Fragment(), OnMapReadyCallback {

    private val vm: MapViewModel by viewModel()

    private lateinit var mMap: GoogleMap
    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mapView = view.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


// Add a marker in Vinnytsia, Ukraine, and move the camera
        val vinnytsia = LatLng(49.2331, 28.4682) // Координати Вінниці
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vinnytsia, 12f))

        subscribeToWorkshopsAndAddMarkers()
    }
    private fun getBitmapDescriptor(resourceId: Int): BitmapDescriptor {
        val drawable = ContextCompat.getDrawable(requireContext(), resourceId) ?: return BitmapDescriptorFactory.defaultMarker()
        val bitmap = Bitmap.createBitmap(drawable.intrinsicWidth, drawable.intrinsicHeight, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, canvas.width, canvas.height)
        drawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    private fun subscribeToWorkshopsAndAddMarkers() {
        vm.workshopsLiveData.observe(viewLifecycleOwner) {
            val icon = getBitmapDescriptor(R.drawable.custom_marker3_foreground)
            it.forEach { workshop ->
                val location = LatLng(workshop.latitude, workshop.longitude)
                mMap.addMarker(
                    MarkerOptions()
                        .position(location)
                        .title(workshop.name)
                        .snippet(workshop.address)
                        .icon(icon)
                )
            }
        }
    }

    override fun onResume() { super.onResume(); mapView.onResume() }
    override fun onPause() { super.onPause(); mapView.onPause() }
    override fun onDestroy() { super.onDestroy(); mapView.onDestroy() }
    override fun onLowMemory() { super.onLowMemory(); mapView.onLowMemory() }

}



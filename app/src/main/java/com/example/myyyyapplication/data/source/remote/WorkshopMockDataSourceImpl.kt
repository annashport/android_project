package com.example.myyyyapplication.data.source.remote

import com.example.myyyyapplication.data.source.remote.model.WorkshopModel

class WorkshopMockDataSourceImpl: WorkshopRemoteDataSource {

    override suspend fun loadWorkshops(): List<WorkshopModel> {
        return listOf(
            WorkshopModel(
                name = "Майстерня Novikova Paint&Craft",
                address = "м. Вінниця, вул. Хлібна 14",
                phone = "(073) 419 32 22",
                website = "https://www.paintcraftworkroom.com/",
                interests = "Малювання",
                days = "Сб-Нд",
                hours = "9:00-17:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Центр розвитку дитини «Бджілка»",
                address = "м. Вінниця, вул. Ватутіна, 27",
                phone = "(063) 286 82 82, (068) 644 00 44",
                website = "http://www.bdjilka.vn.ua/",
                interests = "Рукоділля",
                days = "Пн-Нд",
                hours = "9:00-18:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Дитячий центр “BeFirst.Kids”",
                address = "м. Вінниця, вул. Марії Литвиненко-Вольгемут, 26",
                phone = "(067) 702-6045, (093) 093-9141",
                website = "www.befirst.in.ua",
                interests = "Театральні гуртки",
                days = "Пн-Нд",
                hours = "9:00-18:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Курси акторської майстерності “Червоний Крокодил“",
                address = "м. Вінниця, вул. Миколи Оводова, 22",
                phone = "+38 (067) 184 60 53",
                website = "https://www.facebook.com/schoolredcroco",
                interests = "Театральні гуртки",
                days = "Пн-Пт",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Вінницька дитяча музична школа №1",
                address = "м. Вінниця, вул. Архітектора Артинова, 21",
                phone = "(0432) 562-830",
                website = "https://msh1.edu.vn.ua/",
                interests = "Музика, вокал",
                days = "Пн-Пт",
                hours = "9:00-17:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Вінницька дитяча музична школа №2",
                address = "м. Вінниця, вул. Червоноармійська, 16",
                phone = "(0432) 261-456, (0432) 261-637",
                website = "vdmsh2.vn.ua",
                interests = "Музика, вокал",
                days = "Пн-Пт",
                hours = "9:00-17:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Artinov Studio, приватна музична школа",
                address = "м. Вінниця, вул. Василя Стуса 26",
                phone = "+38 097 776 00 68",
                website = "https://studio.artinov.school/",
                interests = "Музика, вокал",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Вінницька дитяча школа мистецтв",
                address = "м. Вінниця, вул. Островського, 85",
                phone = "(0432) 275-095",
                website = "schoolarts.vn.ua",
                interests = "Музика, вокал",
                days = "Пн-Пт",
                hours = "9:00-17:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Школа програмування для дітей “ROBOCODE”",
                address = "м. Вінниця, вулиця Академіка Ющенко, 6",
                phone = "(093) 170-6445",
                website = "robocode.ua",
                interests = "Технічні гуртки",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Школа “Гарант”",
                address = "м. Вінниця, вул. Київська, 134",
                phone = "(067) 440-5546, (093) 884-7201",
                website = "https://garant-school.com/",
                interests = "Технічні гуртки",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Комп’ютерна академія “ITSTEP”",
                address = "м. Вінниця, пл. Гагаріна, 2",
                phone = "(067) 522-1255, (073) 797-8831",
                website = "https://garant-school.com/",
                interests = "Технічні гуртки",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Бізнес-школа для дітей “Rainbow”",
                address = "м. Вінниця, вул. Пирогова 52а",
                phone = "(067) 631-4351",
                website = "https://rainbow-vinnytsia.webnode.com.ua/",
                interests = "Саморозвиток",
                days = "Сб-Нд",
                hours = "9:00-18:00",
                price = "До 100 грн/год"
            ),
            WorkshopModel(
                name = "Танцювальна студія “Альфа-Денс”",
                address = "м. Вінниця, вул. 600-річчя, 66-Б",
                phone = "(096) 035-16-68",
                website = "https://alphadance.com.ua/",
                interests = "Спортивні секції",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Спорткомплекс “Аква-Він“",
                address = "вул. Академіка Янгеля, 48",
                phone = "(097) 936-8427",
                website = "https://vezha.ua/abonement-za-yakym-vinnychany-zmozhut-hodyty-v-akva-vin-opratsyuyut-na-lyutyj/",
                interests = "Спортивні секції",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "SOUL DANCE CENTRE",
                address = "м. Вінниця, вул. Соборна, 8",
                phone = "(063) 695-0664",
                website = "http://souldancecentre.com/",
                interests = "Спортивні секції",
                days = "Пн-Нд",
                hours = "9:00-19:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "СДЮСШ з легкої атлетики",
                address = "м. Вінниця, вул. Генерала Арабея, 3",
                phone = "(043) 235-4245",
                website = "https://ua.prostobaby.com.ua/spravochniki/razvitie_detey/id/183571",
                interests = "Спортивні секції",
                days = "Пн-Пт",
                hours = "9:00-18:00",
                price = "Безкоштовні"
            ),
            WorkshopModel(
                name = "ВІННИЦЬКА ОБЛАСНА ФЕДЕРАЦІЯ ВЕСЛУВАННЯ НА БАЙДАРКАХ І КАНОЕ",
                address = "м. Вінниця вул. Князів Коріатовичів, 123",
                phone = "(097) 870-0600",
                website = "https://canoe-sprint.vn.ua/shkoli-vesluvannja-u-vinnickij-oblasti",
                interests = "Спортивні секції",
                days = "Пн-Нд",
                hours = "9:00-18:00",
                price = "Безкоштовні"
            ),
            WorkshopModel(
                name = "СДЮСШ з баскетболу",
                address = "м. Вінниця, вул. Пирогова, 4",
                phone = "(067) 431-6546",
                website = "https://edusearch.com.ua/vn/school/vinnicka-miska-specializovana-dityacho-yunacka-shk",
                interests = "Спортивні секції",
                days = "Пн-Пт",
                hours = "9:00-19:00",
                price = "Безкоштовні"
            ),
            WorkshopModel(
                name = "СДЮСШ з акробатики",
                address = "вул. Червонохрестівська, 11",
                phone = "(043) 269-7968",
                website = "https://ua.prostobaby.com.ua/spravochniki/razvitie_detey/id/183568",
                interests = "Спортивні секції",
                days = "Пн-Пт",
                hours = "9:00-19:00",
                price = "Безкоштовні"
            ),
            WorkshopModel(
                name = "Центр Іноземних Мов ASAP",
                address = "м. Вінниця, вул. Ак. Ющенка, 6",
                phone = "(096) 390-0090",
                website = "http://asap.vn.ua/",
                interests = "Вивчення мов",
                days = "Пн-Нд",
                hours = "9:00-18:00",
                price = "Більше 100 грн/год"
            ),
            WorkshopModel(
                name = "Школа “WizarD”",
                address = "м. Вінниця, пр. Юності, 61",
                phone = "(097) 077-4303",
                website = "http://wizardschool.com.ua/",
                interests = "Вивчення мов",
                days = "Пн-Нд",
                hours = "9:00-18:00",
                price = "Більше 100 грн/год"
            ),
        )
    }
}
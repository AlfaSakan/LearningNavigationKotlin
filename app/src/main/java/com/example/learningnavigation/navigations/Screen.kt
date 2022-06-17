package com.example.learningnavigation.navigations

const val DETAIL_ARGUMENTS_KEY_ID = "id"
const val DETAIL_ARGUMENTS_KEY_NAME = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Detail :
        Screen(route = "detail_screen?id={$DETAIL_ARGUMENTS_KEY_ID}&name={$DETAIL_ARGUMENTS_KEY_NAME}") {
        fun passId(id: Int = 10): String {
            return this.route.replace(
                oldValue = "{$DETAIL_ARGUMENTS_KEY_ID}",
                newValue = id.toString()
            )
        }

        fun passNameAndId(
            id: Int = 7,
            name: String = "Alfa Sakan"
        ): String {
            return this.route.replace(
                oldValue = "{$DETAIL_ARGUMENTS_KEY_ID}",
                newValue = id.toString()
            ).replace(
                oldValue = "{$DETAIL_ARGUMENTS_KEY_NAME}",
                newValue = name
            )
        }
    }
//    object Detail :
//        Screen(route = "detail_screen/{$DETAIL_ARGUMENTS_KEY_ID}/{$DETAIL_ARGUMENTS_KEY_NAME}") {
//        fun passId(id: Int): String {
//            return this.route.replace(
//                oldValue = "{$DETAIL_ARGUMENTS_KEY_ID}",
//                newValue = id.toString()
//            )
//        }
//
//        fun passNameAndId(id: Int, name: String): String {
//            return this.route.replace(
//                oldValue = "{$DETAIL_ARGUMENTS_KEY_ID}",
//                newValue = id.toString()
//            ).replace(
//                oldValue = "{$DETAIL_ARGUMENTS_KEY_NAME}",
//                newValue = name
//            )
//        }
//    }

    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}

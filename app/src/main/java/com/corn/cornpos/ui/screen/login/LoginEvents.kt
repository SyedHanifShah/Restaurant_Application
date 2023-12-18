package com.corn.cornpos.ui.screen.login

sealed class LoginEvents{

        data class OnPasswordChange(val password:String):LoginEvents()
        data class OnUserNameChange(val userName:String):LoginEvents()
        object OnLoginClick: LoginEvents()
        object OnForgotPasswordClick: LoginEvents()
        object OnFingerPrentClick: LoginEvents()


}

package com.ichords.app.modules.login.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCompartilheas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_compartilhe_a_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsqueceuasenh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esqueceu_a_senh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOucontinuecom: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ou_continue_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameTenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContinuewithFValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContinuewithGValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etContinuewithAValue: String? = null
)

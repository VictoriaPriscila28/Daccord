package com.ichords.app.modules.msicaletra.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class MSicaLetraRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAmFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_am)

)

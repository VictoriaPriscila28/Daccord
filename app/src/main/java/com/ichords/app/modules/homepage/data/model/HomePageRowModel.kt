package com.ichords.app.modules.homepage.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheUnforgiven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_unforgiven)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMetallicaOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_metallica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRockOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_rock)

)

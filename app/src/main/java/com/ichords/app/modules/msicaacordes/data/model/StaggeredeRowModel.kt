package com.ichords.app.modules.msicaacordes.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class StaggeredeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_am)

)

package com.ichords.app.modules.categoria.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGospelReligios: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gospel_religios)

)

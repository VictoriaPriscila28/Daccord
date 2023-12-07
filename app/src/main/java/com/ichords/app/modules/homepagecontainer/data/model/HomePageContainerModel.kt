package com.ichords.app.modules.homepagecontainer.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLies: String? = MyApp.getInstance().resources.getString(R.string.lbl_li_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAulas: String? = MyApp.getInstance().resources.getString(R.string.lbl_aulas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAfinador: String? = MyApp.getInstance().resources.getString(R.string.lbl_afinador)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPerfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_perfil)

)

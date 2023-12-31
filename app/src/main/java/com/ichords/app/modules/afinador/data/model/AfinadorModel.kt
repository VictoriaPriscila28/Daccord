package com.ichords.app.modules.afinador.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class AfinadorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAfinador: String? = MyApp.getInstance().resources.getString(R.string.lbl_afinador)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAfineoseuvio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_afine_o_seu_vio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAfrouxar: String? = MyApp.getInstance().resources.getString(R.string.lbl_afrouxar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApertar: String? = MyApp.getInstance().resources.getString(R.string.lbl_apertar)

)

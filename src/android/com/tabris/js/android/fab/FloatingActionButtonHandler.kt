package com.tabris.js.android.fab

import com.eclipsesource.tabris.android.ActivityScope
import com.eclipsesource.tabris.android.Property
import com.eclipsesource.tabris.android.internal.nativeobject.view.ViewHandler
import com.eclipsesource.v8.V8Object
import com.google.android.material.floatingactionbutton.FloatingActionButton

@Suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
class FloatingActionButtonHandler(private val scope: ActivityScope) :
    ViewHandler<FloatingActionButton>(scope) {

  override val type = "custom.FloatingActionButton"

  override val properties by lazy {
    super.properties + listOf<Property<*, *>>(
        ImageProperty(scope)
    )
  }

  override fun create(id: String, properties: V8Object) = FloatingActionButton(scope.activity)

  override fun call(button: FloatingActionButton, method: String, properties: V8Object): Any? {
    when (method) {
        "show" -> button.show()
        "hide" -> button.hide()
    }
    return super.call(button, method, properties)
  }

  override fun listen(id: String, button: FloatingActionButton, event: String, listen: Boolean) =
      when (event) {
          "select" -> button.setOnClickListener { scope.remoteObject(it)?.notify("select") }
        else -> super.listen(id, button, event, listen)
      }

}

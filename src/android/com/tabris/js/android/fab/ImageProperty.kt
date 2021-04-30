package com.tabris.js.android.fab

import com.eclipsesource.tabris.android.AnyProperty
import com.eclipsesource.tabris.android.Scope
import com.eclipsesource.tabris.android.internal.image.Image
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ImageProperty(private val scope: Scope) : AnyProperty<FloatingActionButton>("image", {
  scope.imageLoader.load(Image(scope, it)) { drawable -> setImageDrawable(drawable) }
})
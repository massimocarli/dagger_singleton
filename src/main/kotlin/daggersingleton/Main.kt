package daggersingleton

import daggersingleton.di.DaggerAppComponent

fun main() {
  DaggerAppComponent.create().app().execute()
  DaggerAppComponent.create().app().execute()
}
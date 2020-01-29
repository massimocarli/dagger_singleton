package daggersingleton

import daggersingleton.di.DaggerAppComponent

fun main() {
  DaggerAppComponent.create().appBis().execute()
  DaggerAppComponent.create().appBis().execute()
}
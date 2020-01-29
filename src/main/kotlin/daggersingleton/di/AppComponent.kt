package daggersingleton.di

import dagger.Component
import daggersingleton.MyApp
import daggersingleton.MyAppBis
import javax.inject.Singleton

@Singleton
@AppScope
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

  fun app(): MyApp

  fun appBis(): MyAppBis
}
package daggersingleton.di

import dagger.Binds
import dagger.Module
import daggersingleton.Printer
import daggersingleton.PrinterImpl

@Module
abstract class AppModule {

  @Binds
  abstract fun printer(printer: PrinterImpl): Printer
}
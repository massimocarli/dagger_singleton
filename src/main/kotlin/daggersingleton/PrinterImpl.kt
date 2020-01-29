package daggersingleton

import daggersingleton.di.AppScope
import javax.inject.Inject

/**
 * Simple Printer implementation
 */
//@Singleton
@AppScope
class PrinterImpl @Inject constructor() : Printer {
  override fun print(msg: String) {
    kotlin.io.println(msg)
  }
}
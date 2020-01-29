package daggersingleton

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyApp @Inject constructor(private val printer: Printer) {

  fun execute() {
    printer.print("Hello world from $this using $printer")
  }
}
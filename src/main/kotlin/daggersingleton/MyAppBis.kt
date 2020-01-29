package daggersingleton

import javax.inject.Inject

class MyAppBis @Inject constructor(
  private val printer1: Printer,
  private val printer2: Printer
) {

  fun execute() {
    printer1.print("Hello world from $this using $printer1")
    printer2.print("Hello world from $this using $printer2")
  }
}
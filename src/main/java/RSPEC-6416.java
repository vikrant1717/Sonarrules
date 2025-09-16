/**
 * Set the oven temperature
 * @param temp the temperature in Celsius, between 0 and 250 (inclusive)
 * @throws IllegalArgumentException if the temperature is outside of the supported range
 */
private void setOvenTemperature(int temp) {
  if (temp < 0 || temp > 250) {
    throw new IllegalArgumentException();
  }
  // ...
}

void finishCooking() {
  setOvenTemperature(-3); // Noncompliant
}

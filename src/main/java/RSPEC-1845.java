public class Car{

  public DriveTrain drive;

  public void tearDown(){
    // method implementation
  }

  public void drive() { // Noncompliant; duplicates field name
    // method implementation
  }
}

public class MyCar extends Car{
  public void teardown(){ // Noncompliant; not an override. It it really what's intended?
    // method implementation
  }

  public void drivefast(){
    // method implementation
  }

  public void driveFast(){ // Huh?
    // method implementation
  }
}

class DriveTrain {}

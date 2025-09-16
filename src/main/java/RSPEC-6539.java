class Foo { // Noncompliant: Monster Class
  T1 t1;
  T2 t2;
  T3 t3;

  public T4 compute(T5 a, T6 b) {
    T7 result = a.getResult(b);
    return (T4) result;
  }
}

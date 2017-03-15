//: reusing/FinalOverridingIllusion.java
package reusing; /* Added by Eclipse.py */
// It only looks like you can override
// a private or private final method.
import static net.mindview.util.Print.*;

class WithFinals {
  // Identical to "private" alone:
  private final void f() { print("WithFinals.f()"); }
  // Also automatically "final":
  private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
  public void f() {
    print("OverridingPrivate.f()");
  }
  private void g() {
    print("OverridingPrivate.g()");
  }

  public final void h() {
    print("OverridingPrivate.h()");
  }

}

class OverridingPrivate2 extends OverridingPrivate {
  @Override
  public final void f() {
    print("OverridingPrivate2.f()");
  }
  public void g() {
    print("OverridingPrivate2.g()");
  }
// cann't overriding public final method
//  public void h(){
//    print("OverridingPrivate2.h()");
//  }
}

public class FinalOverridingIllusion {
  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();
    op2.h();
    // You can upcast:
    OverridingPrivate op = op2;
    // But you can't call the methods:
    op.f();
    //! op.g();
    OverridingPrivate op3 = new OverridingPrivate();
    op3.f();
    // Same here:
    WithFinals wf = op2;
    //! wf.f();
    //! wf.g();
  }
} /* Output:
OverridingPrivate2.f()
OverridingPrivate2.g()
*///:~

package net.pizey;

/**
 * @author timp
 * @since 2014/08/19
 */
public class FinallyEqual {

  /** The field. */
  private Object f;

  /** Constructor.
   * @param field the field
   */
  public FinallyEqual(final Object field) {
    this.f = field;
  }

  /** Get the field.
   * @return the field
   */
  public final Object getField() {
    return f;
  }

  /** Set the field.
   * @param field the field
   */
  public final void setField(final Object field) {
    this.f = field;
  }


  /**
   * @param o Object
   * @return whether equal
   */
  @Override
  public final boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FinallyEqual)) {
      return false;
    }

    final FinallyEqual that = (FinallyEqual) o;

    if (!f.equals(that.f)) {
      return false;
    }

    return true;
  }

  /** @return a hashcode */
  @Override
  public final int hashCode() {
    return f.hashCode();
  }
}

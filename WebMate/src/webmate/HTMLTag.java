/**
 */
package webmate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HTML Tag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webmate.WebmatePackage#getHTMLTag()
 * @model
 * @generated
 */
public enum HTMLTag implements Enumerator {
	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(0, "div", "div"),

	/**
	 * The '<em><b>H1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1_VALUE
	 * @generated
	 * @ordered
	 */
	H1(1, "h1", "h1"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(2, "p", "p"),

	/**
	 * The '<em><b>Ul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UL_VALUE
	 * @generated
	 * @ordered
	 */
	UL(3, "ul", "ul"),

	/**
	 * The '<em><b>Li</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LI_VALUE
	 * @generated
	 * @ordered
	 */
	LI(4, "li", "li");

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 0;

	/**
	 * The '<em><b>H1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1
	 * @model name="h1"
	 * @generated
	 * @ordered
	 */
	public static final int H1_VALUE = 1;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model name="p"
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 2;

	/**
	 * The '<em><b>Ul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UL
	 * @model name="ul"
	 * @generated
	 * @ordered
	 */
	public static final int UL_VALUE = 3;

	/**
	 * The '<em><b>Li</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LI
	 * @model name="li"
	 * @generated
	 * @ordered
	 */
	public static final int LI_VALUE = 4;

	/**
	 * An array of all the '<em><b>HTML Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HTMLTag[] VALUES_ARRAY =
		new HTMLTag[] {
			DIV,
			H1,
			P,
			UL,
			LI,
		};

	/**
	 * A public read-only list of all the '<em><b>HTML Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HTMLTag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HTML Tag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTMLTag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTMLTag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTML Tag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTMLTag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTMLTag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTML Tag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTMLTag get(int value) {
		switch (value) {
			case DIV_VALUE: return DIV;
			case H1_VALUE: return H1;
			case P_VALUE: return P;
			case UL_VALUE: return UL;
			case LI_VALUE: return LI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HTMLTag(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HTMLTag

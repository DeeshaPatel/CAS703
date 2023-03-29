/**
 */
package webmate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Valid Symbol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see webmate.WebmatePackage#getValidSymbol()
 * @model
 * @generated
 */
public enum ValidSymbol implements Enumerator {
	/**
	 * The '<em><b>Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS(0, "plus", "+"),

	/**
	 * The '<em><b>Multiply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLY(1, "multiply", "multiply"),

	/**
	 * The '<em><b>Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_VALUE
	 * @generated
	 * @ordered
	 */
	DOT(2, "dot", "dot"),

	/**
	 * The '<em><b>Hash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASH_VALUE
	 * @generated
	 * @ordered
	 */
	HASH(3, "hash", "hash"),

	/**
	 * The '<em><b>Greaterthan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN_VALUE
	 * @generated
	 * @ordered
	 */
	GREATERTHAN(4, "greaterthan", "greaterthan"),

	/**
	 * The '<em><b>Caret</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARET_VALUE
	 * @generated
	 * @ordered
	 */
	CARET(5, "caret", "caret");

	/**
	 * The '<em><b>Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS
	 * @model name="plus" literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_VALUE = 0;

	/**
	 * The '<em><b>Multiply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY
	 * @model name="multiply"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLY_VALUE = 1;

	/**
	 * The '<em><b>Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT
	 * @model name="dot"
	 * @generated
	 * @ordered
	 */
	public static final int DOT_VALUE = 2;

	/**
	 * The '<em><b>Hash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HASH
	 * @model name="hash"
	 * @generated
	 * @ordered
	 */
	public static final int HASH_VALUE = 3;

	/**
	 * The '<em><b>Greaterthan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATERTHAN
	 * @model name="greaterthan"
	 * @generated
	 * @ordered
	 */
	public static final int GREATERTHAN_VALUE = 4;

	/**
	 * The '<em><b>Caret</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARET
	 * @model name="caret"
	 * @generated
	 * @ordered
	 */
	public static final int CARET_VALUE = 5;

	/**
	 * An array of all the '<em><b>Valid Symbol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValidSymbol[] VALUES_ARRAY =
		new ValidSymbol[] {
			PLUS,
			MULTIPLY,
			DOT,
			HASH,
			GREATERTHAN,
			CARET,
		};

	/**
	 * A public read-only list of all the '<em><b>Valid Symbol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValidSymbol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Valid Symbol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidSymbol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidSymbol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valid Symbol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidSymbol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidSymbol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valid Symbol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidSymbol get(int value) {
		switch (value) {
			case PLUS_VALUE: return PLUS;
			case MULTIPLY_VALUE: return MULTIPLY;
			case DOT_VALUE: return DOT;
			case HASH_VALUE: return HASH;
			case GREATERTHAN_VALUE: return GREATERTHAN;
			case CARET_VALUE: return CARET;
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
	private ValidSymbol(int value, String name, String literal) {
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
	
} //ValidSymbol

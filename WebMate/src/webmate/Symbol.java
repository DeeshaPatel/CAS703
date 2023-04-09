/**
 */
package webmate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webmate.Symbol#getTag <em>Tag</em>}</li>
 *   <li>{@link webmate.Symbol#getCount <em>Count</em>}</li>
 *   <li>{@link webmate.Symbol#getSym <em>Sym</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(Tag)
	 * @see webmate.WebmatePackage#getSymbol_Tag()
	 * @model containment="true"
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link webmate.Symbol#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see webmate.WebmatePackage#getSymbol_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link webmate.Symbol#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Sym</b></em>' attribute.
	 * The literals are from the enumeration {@link webmate.SYM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sym</em>' attribute.
	 * @see webmate.SYM
	 * @see #setSym(SYM)
	 * @see webmate.WebmatePackage#getSymbol_Sym()
	 * @model
	 * @generated
	 */
	SYM getSym();

	/**
	 * Sets the value of the '{@link webmate.Symbol#getSym <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sym</em>' attribute.
	 * @see webmate.SYM
	 * @see #getSym()
	 * @generated
	 */
	void setSym(SYM value);

} // Symbol

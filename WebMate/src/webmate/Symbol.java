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
 *   <li>{@link webmate.Symbol#getSym <em>Sym</em>}</li>
 *   <li>{@link webmate.Symbol#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see webmate.WebmatePackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject {
	/**
	 * Returns the value of the '<em><b>Sym</b></em>' attribute.
	 * The literals are from the enumeration {@link webmate.ValidSymbol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sym</em>' attribute.
	 * @see webmate.ValidSymbol
	 * @see #setSym(ValidSymbol)
	 * @see webmate.WebmatePackage#getSymbol_Sym()
	 * @model
	 * @generated
	 */
	ValidSymbol getSym();

	/**
	 * Sets the value of the '{@link webmate.Symbol#getSym <em>Sym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sym</em>' attribute.
	 * @see webmate.ValidSymbol
	 * @see #getSym()
	 * @generated
	 */
	void setSym(ValidSymbol value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @see webmate.WebmatePackage#getSymbol_Tag()
	 * @model
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link webmate.Symbol#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

} // Symbol

/**
 */
package webmate.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import webmate.Abbreviation;
import webmate.WebmateFactory;
import webmate.WebmatePackage;

/**
 * This is the item provider adapter for a {@link webmate.Abbreviation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbbreviationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAbbreviationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abbreviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbbreviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Abbreviation_abbreviation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Abbreviation_abbreviation_feature", "_UI_Abbreviation_type"),
				 WebmatePackage.Literals.ABBREVIATION__ABBREVIATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__IDS);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__SYMBOLS);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__TAGS);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__CLASSES);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__ATTRIBUTES);
			childrenFeatures.add(WebmatePackage.Literals.ABBREVIATION__GROUP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Abbreviation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Abbreviation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Abbreviation_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Abbreviation.class)) {
			case WebmatePackage.ABBREVIATION__IDS:
			case WebmatePackage.ABBREVIATION__SYMBOLS:
			case WebmatePackage.ABBREVIATION__TAGS:
			case WebmatePackage.ABBREVIATION__CLASSES:
			case WebmatePackage.ABBREVIATION__ATTRIBUTES:
			case WebmatePackage.ABBREVIATION__GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__IDS,
				 WebmateFactory.eINSTANCE.createID()));

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__SYMBOLS,
				 WebmateFactory.eINSTANCE.createSymbol()));

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__TAGS,
				 WebmateFactory.eINSTANCE.createTag()));

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__CLASSES,
				 WebmateFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__ATTRIBUTES,
				 WebmateFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(WebmatePackage.Literals.ABBREVIATION__GROUP,
				 WebmateFactory.eINSTANCE.createGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebMateEditPlugin.INSTANCE;
	}

}

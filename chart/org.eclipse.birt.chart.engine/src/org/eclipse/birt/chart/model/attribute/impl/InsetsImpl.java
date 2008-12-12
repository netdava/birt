/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.attribute.impl;

import org.eclipse.birt.chart.model.attribute.AttributeFactory;
import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Insets</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.InsetsImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.InsetsImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.InsetsImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.InsetsImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsetsImpl extends EObjectImpl implements Insets
{

	/**
	 * The default value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTop() <em>Top</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTop()
	 * @generated
	 * @ordered
	 */
	protected double top = TOP_EDEFAULT;

	/**
	 * This is true if the Top attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topESet = false;

	/**
	 * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected static final double LEFT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected double left = LEFT_EDEFAULT;

	/**
	 * This is true if the Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean leftESet = false;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final double BOTTOM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected double bottom = BOTTOM_EDEFAULT;

	/**
	 * This is true if the Bottom attribute has been set.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bottomESet = false;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final double RIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected double right = RIGHT_EDEFAULT;

	/**
	 * This is true if the Right attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rightESet = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InsetsImpl( )
	{
		super( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass( )
	{
		return AttributePackage.Literals.INSETS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getTop( )
	{
		return top;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop( double newTop )
	{
		double oldTop = top;
		top = newTop;
		boolean oldTopESet = topESet;
		topESet = true;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.INSETS__TOP,
					oldTop,
					top,
					!oldTopESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTop( )
	{
		double oldTop = top;
		boolean oldTopESet = topESet;
		top = TOP_EDEFAULT;
		topESet = false;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.UNSET,
					AttributePackage.INSETS__TOP,
					oldTop,
					TOP_EDEFAULT,
					oldTopESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTop( )
	{
		return topESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getLeft( )
	{
		return left;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft( double newLeft )
	{
		double oldLeft = left;
		left = newLeft;
		boolean oldLeftESet = leftESet;
		leftESet = true;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.INSETS__LEFT,
					oldLeft,
					left,
					!oldLeftESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLeft( )
	{
		double oldLeft = left;
		boolean oldLeftESet = leftESet;
		left = LEFT_EDEFAULT;
		leftESet = false;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.UNSET,
					AttributePackage.INSETS__LEFT,
					oldLeft,
					LEFT_EDEFAULT,
					oldLeftESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLeft( )
	{
		return leftESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getBottom( )
	{
		return bottom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom( double newBottom )
	{
		double oldBottom = bottom;
		bottom = newBottom;
		boolean oldBottomESet = bottomESet;
		bottomESet = true;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.INSETS__BOTTOM,
					oldBottom,
					bottom,
					!oldBottomESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBottom( )
	{
		double oldBottom = bottom;
		boolean oldBottomESet = bottomESet;
		bottom = BOTTOM_EDEFAULT;
		bottomESet = false;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.UNSET,
					AttributePackage.INSETS__BOTTOM,
					oldBottom,
					BOTTOM_EDEFAULT,
					oldBottomESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBottom( )
	{
		return bottomESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getRight( )
	{
		return right;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight( double newRight )
	{
		double oldRight = right;
		right = newRight;
		boolean oldRightESet = rightESet;
		rightESet = true;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.INSETS__RIGHT,
					oldRight,
					right,
					!oldRightESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRight( )
	{
		double oldRight = right;
		boolean oldRightESet = rightESet;
		right = RIGHT_EDEFAULT;
		rightESet = false;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.UNSET,
					AttributePackage.INSETS__RIGHT,
					oldRight,
					RIGHT_EDEFAULT,
					oldRightESet ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRight( )
	{
		return rightESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet( int featureID, boolean resolve, boolean coreType )
	{
		switch ( featureID )
		{
			case AttributePackage.INSETS__TOP :
				return new Double( getTop( ) );
			case AttributePackage.INSETS__LEFT :
				return new Double( getLeft( ) );
			case AttributePackage.INSETS__BOTTOM :
				return new Double( getBottom( ) );
			case AttributePackage.INSETS__RIGHT :
				return new Double( getRight( ) );
		}
		return super.eGet( featureID, resolve, coreType );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet( int featureID, Object newValue )
	{
		switch ( featureID )
		{
			case AttributePackage.INSETS__TOP :
				setTop( ( (Double) newValue ).doubleValue( ) );
				return;
			case AttributePackage.INSETS__LEFT :
				setLeft( ( (Double) newValue ).doubleValue( ) );
				return;
			case AttributePackage.INSETS__BOTTOM :
				setBottom( ( (Double) newValue ).doubleValue( ) );
				return;
			case AttributePackage.INSETS__RIGHT :
				setRight( ( (Double) newValue ).doubleValue( ) );
				return;
		}
		super.eSet( featureID, newValue );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset( int featureID )
	{
		switch ( featureID )
		{
			case AttributePackage.INSETS__TOP :
				unsetTop( );
				return;
			case AttributePackage.INSETS__LEFT :
				unsetLeft( );
				return;
			case AttributePackage.INSETS__BOTTOM :
				unsetBottom( );
				return;
			case AttributePackage.INSETS__RIGHT :
				unsetRight( );
				return;
		}
		super.eUnset( featureID );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet( int featureID )
	{
		switch ( featureID )
		{
			case AttributePackage.INSETS__TOP :
				return isSetTop( );
			case AttributePackage.INSETS__LEFT :
				return isSetLeft( );
			case AttributePackage.INSETS__BOTTOM :
				return isSetBottom( );
			case AttributePackage.INSETS__RIGHT :
				return isSetRight( );
		}
		return super.eIsSet( featureID );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String toString( )
	{
		if ( eIsProxy( ) )
			return super.toString( );

		StringBuffer result = new StringBuffer( super.toString( ) );
		result.append( " (top: " ); //$NON-NLS-1$
		if ( topESet )
			result.append( top );
		else
			result.append( "<unset>" ); //$NON-NLS-1$
		result.append( ", left: " ); //$NON-NLS-1$
		if ( leftESet )
			result.append( left );
		else
			result.append( "<unset>" ); //$NON-NLS-1$
		result.append( ", bottom: " ); //$NON-NLS-1$
		if ( bottomESet )
			result.append( bottom );
		else
			result.append( "<unset>" ); //$NON-NLS-1$
		result.append( ", right: " ); //$NON-NLS-1$
		if ( rightESet )
			result.append( right );
		else
			result.append( "<unset>" ); //$NON-NLS-1$
		result.append( ')' );
		return result.toString( );
	}

	/**
	 * A convenient method for initializing member variables.
	 * 
	 * Note: Manually written
	 * 
	 * @param dTop
	 * @param dLeft
	 * @param dBottom
	 * @param dRight
	 */
	public void set( double dTop, double dLeft, double dBottom, double dRight )
	{
		setTop( dTop );
		setLeft( dLeft );
		setBottom( dBottom );
		setRight( dRight );
	}

	/**
	 * A convenient method for creating an instance and initializing member
	 * variables.
	 * 
	 * Note: Manually written
	 * 
	 * @param dTop
	 * @param dLeft
	 * @param dBottom
	 * @param dRight
	 * 
	 * @return
	 */
	public static final Insets create( double dTop, double dLeft,
			double dBottom, double dRight )
	{
		final Insets ins = AttributeFactory.eINSTANCE.createInsets( );
		ins.setTop( dTop );
		ins.setLeft( dLeft );
		ins.setBottom( dBottom );
		ins.setRight( dRight );
		return ins;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.chart.model.attribute.Insets#scaledInstance(double)
	 */
	public final Insets scaledInstance( double dScale )
	{
		final Insets ins = copyInstance( this );
		ins.setTop( ins.getTop( ) * dScale );
		ins.setLeft( ins.getLeft( ) * dScale );
		ins.setBottom( ins.getBottom( ) * dScale );
		ins.setRight( ins.getRight( ) * dScale );
		return ins;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.chart.model.attribute.Insets#areLessThan(double)
	 */
	public boolean areLessThan( double dValue )
	{
		return getTop( ) < dValue
				&& getBottom( ) < dValue && getLeft( ) < dValue
				&& getRight( ) < dValue;
	}

	/**
	 * 
	 * @param ins1
	 * @param ins2
	 * @return
	 */
	public static final Insets max( Insets ins1, Insets ins2 )
	{
		return InsetsImpl.create( Math.max( ins1.getTop( ), ins2.getTop( ) ),
				Math.max( ins1.getLeft( ), ins2.getLeft( ) ),
				Math.max( ins1.getBottom( ), ins2.getBottom( ) ),
				Math.max( ins1.getRight( ), ins2.getRight( ) ) );
	}

	/**
	 * 
	 * @param ins1
	 * @param ins2
	 * @return
	 */
	public static final Insets min( Insets ins1, Insets ins2 )
	{
		return InsetsImpl.create( Math.min( ins1.getTop( ), ins2.getTop( ) ),
				Math.min( ins1.getLeft( ), ins2.getLeft( ) ),
				Math.min( ins1.getBottom( ), ins2.getBottom( ) ),
				Math.min( ins1.getRight( ), ins2.getRight( ) ) );
	}

	/**
	 * A convenient method to get an instance copy. This is much faster than the
	 * ECoreUtil.copy().
	 * 
	 * @param src
	 * @return
	 */
	public static Insets copyInstance( Insets src )
	{
		if ( src == null )
		{
			return null;
		}
		InsetsImpl ins = new InsetsImpl( );
		ins.bottom = src.getBottom( );
		ins.bottomESet = src.isSetBottom( );
		ins.left = src.getLeft( );
		ins.leftESet = src.isSetLeft( );
		ins.right = src.getRight( );
		ins.rightESet = src.isSetRight( );
		ins.top = src.getTop( );
		ins.topESet = src.isSetTop( );
		return ins;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode( )
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits( bottom );
		result = prime * result + (int) ( temp ^ ( temp >>> 32 ) );
		result = prime * result + ( bottomESet ? 1231 : 1237 );
		temp = Double.doubleToLongBits( left );
		result = prime * result + (int) ( temp ^ ( temp >>> 32 ) );
		result = prime * result + ( leftESet ? 1231 : 1237 );
		temp = Double.doubleToLongBits( right );
		result = prime * result + (int) ( temp ^ ( temp >>> 32 ) );
		result = prime * result + ( rightESet ? 1231 : 1237 );
		temp = Double.doubleToLongBits( top );
		result = prime * result + (int) ( temp ^ ( temp >>> 32 ) );
		result = prime * result + ( topESet ? 1231 : 1237 );
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals( Object obj )
	{
		if ( this == obj )
			return true;
		if ( obj == null )
			return false;
		if ( getClass( ) != obj.getClass( ) )
			return false;
		InsetsImpl other = (InsetsImpl) obj;
		if ( Double.doubleToLongBits( bottom ) != Double.doubleToLongBits( other.bottom ) )
			return false;
		if ( bottomESet != other.bottomESet )
			return false;
		if ( Double.doubleToLongBits( left ) != Double.doubleToLongBits( other.left ) )
			return false;
		if ( leftESet != other.leftESet )
			return false;
		if ( Double.doubleToLongBits( right ) != Double.doubleToLongBits( other.right ) )
			return false;
		if ( rightESet != other.rightESet )
			return false;
		if ( Double.doubleToLongBits( top ) != Double.doubleToLongBits( other.top ) )
			return false;
		if ( topESet != other.topESet )
			return false;
		return true;
	}

} // InsetsImpl

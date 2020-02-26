/**
 */
package eel.impl;

import eel.EelFactory;
import eel.EelPackage;
import eel.EnergyComputation;
import eel.Integral;
import eel.Interval;
import eel.Measure;
import eel.MeasureAttribute;
import eel.MeasureCast;
import eel.MeasureOCL;
import eel.MeasureOperation;
import eel.MeasureProductOperation;
import eel.MeasureSumOperation;
import eel.MeasureValue;
import eel.MeasurementUncertainty;
import eel.MeasurementUncertaintyInformation;
import eel.NormalDistribution;
import eel.Platform;
import eel.PowerComputation;
import eel.Sample;
import eel.Sampling;
import eel.Type;
import eel.TypedMeasure;
import eel.Variable;
import eel.Visibility;

import eel.util.EelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EelPackageImpl extends EPackageImpl implements EelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureOCLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureCastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureProductOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureSumOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyComputationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerComputationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUncertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDistributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementUncertaintyInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass samplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eel.EelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EelPackageImpl() {
		super(eNS_URI, EelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EelPackage init() {
		if (isInited) return (EelPackage)EPackage.Registry.INSTANCE.getEPackage(EelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EelPackageImpl theEelPackage = registeredEelPackage instanceof EelPackageImpl ? (EelPackageImpl)registeredEelPackage : new EelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEelPackage.createPackageContents();

		// Initialize created meta-data
		theEelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEelPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EelPackage.eNS_URI, theEelPackage);
		return theEelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatform_Name() {
		return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Variables() {
		return (EReference)platformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatform_Measures() {
		return (EReference)platformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Vibility() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Name() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_TargetClass() {
		return (EReference)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_TargetOperation() {
		return (EReference)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Uncertainty() {
		return (EReference)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasure__Type() {
		return measureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasure__Value() {
		return measureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedMeasure() {
		return typedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedMeasure_Type() {
		return (EAttribute)typedMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTypedMeasure__Type() {
		return typedMeasureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureValue() {
		return measureValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureValue_Value() {
		return (EAttribute)measureValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasureValue__Value() {
		return measureValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureOCL() {
		return measureOCLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasureOCL_OclQuery() {
		return (EAttribute)measureOCLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureAttribute() {
		return measureAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureAttribute_Att() {
		return (EReference)measureAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureCast() {
		return measureCastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureCast_Measure() {
		return (EReference)measureCastEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureOperation() {
		return measureOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureOperation_Left() {
		return (EReference)measureOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasureOperation_Right() {
		return (EReference)measureOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureProductOperation() {
		return measureProductOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasureProductOperation__Value() {
		return measureProductOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureSumOperation() {
		return measureSumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeasureSumOperation__Value() {
		return measureSumOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyComputation() {
		return energyComputationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyComputation__Type() {
		return energyComputationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnergyComputation__Value() {
		return energyComputationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerComputation() {
		return powerComputationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerComputation__Type() {
		return powerComputationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerComputation__Value() {
		return powerComputationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUncertainty() {
		return measurementUncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurementUncertainty_Information() {
		return (EReference)measurementUncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasurementUncertainty_StandardUncertainty() {
		return (EAttribute)measurementUncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDistribution() {
		return normalDistributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_MeanValue() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalDistribution_StandardDeviation() {
		return (EAttribute)normalDistributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_LowerEndpoint() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_UpperEndpoint() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurementUncertaintyInformation() {
		return measurementUncertaintyInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampling() {
		return samplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampling_Samples() {
		return (EReference)samplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampling_MeasurementProcedure() {
		return (EAttribute)samplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegral() {
		return integralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegral_Interval() {
		return (EReference)integralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegral_Function() {
		return (EAttribute)integralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSample() {
		return sampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSample_Quantity() {
		return (EReference)sampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EelFactory getEelFactory() {
		return (EelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		platformEClass = createEClass(PLATFORM);
		createEAttribute(platformEClass, PLATFORM__NAME);
		createEReference(platformEClass, PLATFORM__VARIABLES);
		createEReference(platformEClass, PLATFORM__MEASURES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VIBILITY);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__NAME);
		createEReference(measureEClass, MEASURE__TARGET_CLASS);
		createEReference(measureEClass, MEASURE__TARGET_OPERATION);
		createEReference(measureEClass, MEASURE__UNCERTAINTY);
		createEOperation(measureEClass, MEASURE___TYPE);
		createEOperation(measureEClass, MEASURE___VALUE);

		typedMeasureEClass = createEClass(TYPED_MEASURE);
		createEAttribute(typedMeasureEClass, TYPED_MEASURE__TYPE);
		createEOperation(typedMeasureEClass, TYPED_MEASURE___TYPE);

		measureValueEClass = createEClass(MEASURE_VALUE);
		createEAttribute(measureValueEClass, MEASURE_VALUE__VALUE);
		createEOperation(measureValueEClass, MEASURE_VALUE___VALUE);

		measureOCLEClass = createEClass(MEASURE_OCL);
		createEAttribute(measureOCLEClass, MEASURE_OCL__OCL_QUERY);

		measureAttributeEClass = createEClass(MEASURE_ATTRIBUTE);
		createEReference(measureAttributeEClass, MEASURE_ATTRIBUTE__ATT);

		measureCastEClass = createEClass(MEASURE_CAST);
		createEReference(measureCastEClass, MEASURE_CAST__MEASURE);

		measureOperationEClass = createEClass(MEASURE_OPERATION);
		createEReference(measureOperationEClass, MEASURE_OPERATION__LEFT);
		createEReference(measureOperationEClass, MEASURE_OPERATION__RIGHT);

		measureProductOperationEClass = createEClass(MEASURE_PRODUCT_OPERATION);
		createEOperation(measureProductOperationEClass, MEASURE_PRODUCT_OPERATION___VALUE);

		measureSumOperationEClass = createEClass(MEASURE_SUM_OPERATION);
		createEOperation(measureSumOperationEClass, MEASURE_SUM_OPERATION___VALUE);

		energyComputationEClass = createEClass(ENERGY_COMPUTATION);
		createEOperation(energyComputationEClass, ENERGY_COMPUTATION___TYPE);
		createEOperation(energyComputationEClass, ENERGY_COMPUTATION___VALUE);

		powerComputationEClass = createEClass(POWER_COMPUTATION);
		createEOperation(powerComputationEClass, POWER_COMPUTATION___TYPE);
		createEOperation(powerComputationEClass, POWER_COMPUTATION___VALUE);

		measurementUncertaintyEClass = createEClass(MEASUREMENT_UNCERTAINTY);
		createEReference(measurementUncertaintyEClass, MEASUREMENT_UNCERTAINTY__INFORMATION);
		createEAttribute(measurementUncertaintyEClass, MEASUREMENT_UNCERTAINTY__STANDARD_UNCERTAINTY);

		normalDistributionEClass = createEClass(NORMAL_DISTRIBUTION);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__MEAN_VALUE);
		createEAttribute(normalDistributionEClass, NORMAL_DISTRIBUTION__STANDARD_DEVIATION);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__LOWER_ENDPOINT);
		createEReference(intervalEClass, INTERVAL__UPPER_ENDPOINT);

		measurementUncertaintyInformationEClass = createEClass(MEASUREMENT_UNCERTAINTY_INFORMATION);

		samplingEClass = createEClass(SAMPLING);
		createEReference(samplingEClass, SAMPLING__SAMPLES);
		createEAttribute(samplingEClass, SAMPLING__MEASUREMENT_PROCEDURE);

		integralEClass = createEClass(INTEGRAL);
		createEReference(integralEClass, INTEGRAL__INTERVAL);
		createEAttribute(integralEClass, INTEGRAL__FUNCTION);

		sampleEClass = createEClass(SAMPLE);
		createEReference(sampleEClass, SAMPLE__QUANTITY);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typedMeasureEClass.getESuperTypes().add(this.getMeasure());
		measureValueEClass.getESuperTypes().add(this.getTypedMeasure());
		measureOCLEClass.getESuperTypes().add(this.getMeasureValue());
		measureAttributeEClass.getESuperTypes().add(this.getMeasureValue());
		measureCastEClass.getESuperTypes().add(this.getTypedMeasure());
		measureOperationEClass.getESuperTypes().add(this.getMeasure());
		measureProductOperationEClass.getESuperTypes().add(this.getMeasureOperation());
		measureSumOperationEClass.getESuperTypes().add(this.getMeasureOperation());
		energyComputationEClass.getESuperTypes().add(this.getMeasureProductOperation());
		powerComputationEClass.getESuperTypes().add(this.getMeasureProductOperation());
		normalDistributionEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		intervalEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		samplingEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());
		integralEClass.getESuperTypes().add(this.getMeasurementUncertaintyInformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatform_Name(), ecorePackage.getEString(), "name", null, 0, 1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Variables(), this.getVariable(), null, "variables", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatform_Measures(), this.getMeasure(), null, "measures", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Vibility(), this.getVisibility(), "vibility", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_TargetClass(), ecorePackage.getEClass(), null, "targetClass", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_TargetOperation(), ecorePackage.getEOperation(), null, "targetOperation", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Uncertainty(), this.getMeasurementUncertainty(), null, "uncertainty", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeasure__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMeasure__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typedMeasureEClass, TypedMeasure.class, "TypedMeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedMeasure_Type(), this.getType(), "type", null, 1, 1, TypedMeasure.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getTypedMeasure__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureValueEClass, MeasureValue.class, "MeasureValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, MeasureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMeasureValue__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureOCLEClass, MeasureOCL.class, "MeasureOCL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureOCL_OclQuery(), ecorePackage.getEString(), "oclQuery", null, 0, 1, MeasureOCL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureAttributeEClass, MeasureAttribute.class, "MeasureAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureAttribute_Att(), ecorePackage.getEAttribute(), null, "att", null, 0, 1, MeasureAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureCastEClass, MeasureCast.class, "MeasureCast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureCast_Measure(), this.getMeasure(), null, "measure", null, 1, 1, MeasureCast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureOperationEClass, MeasureOperation.class, "MeasureOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasureOperation_Left(), this.getMeasure(), null, "left", null, 0, 1, MeasureOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureOperation_Right(), this.getMeasure(), null, "right", null, 0, 1, MeasureOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureProductOperationEClass, MeasureProductOperation.class, "MeasureProductOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMeasureProductOperation__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureSumOperationEClass, MeasureSumOperation.class, "MeasureSumOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMeasureSumOperation__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(energyComputationEClass, EnergyComputation.class, "EnergyComputation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEnergyComputation__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnergyComputation__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(powerComputationEClass, PowerComputation.class, "PowerComputation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPowerComputation__Type(), this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPowerComputation__Value(), ecorePackage.getEBigDecimal(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measurementUncertaintyEClass, MeasurementUncertainty.class, "MeasurementUncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurementUncertainty_Information(), this.getMeasurementUncertaintyInformation(), null, "information", null, 0, 1, MeasurementUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasurementUncertainty_StandardUncertainty(), ecorePackage.getEBigDecimal(), "standardUncertainty", null, 0, 1, MeasurementUncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalDistributionEClass, NormalDistribution.class, "NormalDistribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalDistribution_MeanValue(), ecorePackage.getEBigDecimal(), "meanValue", null, 0, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalDistribution_StandardDeviation(), ecorePackage.getEBigDecimal(), "standardDeviation", null, 0, 1, NormalDistribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_LowerEndpoint(), this.getMeasure(), null, "lowerEndpoint", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterval_UpperEndpoint(), this.getMeasure(), null, "upperEndpoint", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementUncertaintyInformationEClass, MeasurementUncertaintyInformation.class, "MeasurementUncertaintyInformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(samplingEClass, Sampling.class, "Sampling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampling_Samples(), this.getSample(), null, "samples", null, 0, -1, Sampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampling_MeasurementProcedure(), ecorePackage.getEString(), "measurementProcedure", null, 0, 1, Sampling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integralEClass, Integral.class, "Integral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegral_Interval(), this.getInterval(), null, "interval", null, 1, 1, Integral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegral_Function(), ecorePackage.getEString(), "function", null, 0, 1, Integral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampleEClass, Sample.class, "Sample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSample_Quantity(), this.getMeasure(), null, "quantity", null, 0, -1, Sample.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.LOCAL);
		addEEnumLiteral(visibilityEEnum, Visibility.GLOBAL);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.ENERGY);
		addEEnumLiteral(typeEEnum, Type.DURATION);
		addEEnumLiteral(typeEEnum, Type.POWER);
		addEEnumLiteral(typeEEnum, Type.CURRENT);
		addEEnumLiteral(typeEEnum, Type.VOLTAGE);
		addEEnumLiteral(typeEEnum, Type.SCALAR);
		addEEnumLiteral(typeEEnum, Type.FREQUENCY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (measureAttributeEClass,
		   source,
		   new String[] {
			   "constraints", "isAttribute"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getMeasure__Type(),
		   source,
		   new String[] {
			   "body", "null"
		   });
		addAnnotation
		  (getMeasure__Value(),
		   source,
		   new String[] {
			   "body", "0"
		   });
		addAnnotation
		  (getTypedMeasure__Type(),
		   source,
		   new String[] {
			   "body", "self.type"
		   });
		addAnnotation
		  (getMeasureValue__Value(),
		   source,
		   new String[] {
			   "body", "self.value"
		   });
		addAnnotation
		  (measureAttributeEClass,
		   source,
		   new String[] {
			   "isAttribute", "self.att.oclIsKindOf(ecore::EAttribute)"
		   });
		addAnnotation
		  (getMeasureProductOperation__Value(),
		   source,
		   new String[] {
			   "body", "self.left.value() * self.right.value()"
		   });
		addAnnotation
		  (getMeasureSumOperation__Value(),
		   source,
		   new String[] {
			   "body", "self.left.value() + self.right.value()"
		   });
		addAnnotation
		  (getEnergyComputation__Type(),
		   source,
		   new String[] {
			   "body", "Type::Energy"
		   });
		addAnnotation
		  (getEnergyComputation__Value(),
		   source,
		   new String[] {
			   "body", "self.left.value() * self.right.value()",
			   "pre_isPowerAndDuration", "(self.left.type() = Type::Power and self.right.type() = Type::Duration) or (self.right.type() = Type::Power and self.left.type() = Type::Duration)"
		   });
		addAnnotation
		  (getPowerComputation__Type(),
		   source,
		   new String[] {
			   "body", "Type::Power"
		   });
		addAnnotation
		  (getPowerComputation__Value(),
		   source,
		   new String[] {
			   "body", "self.left.value() * self.right.value()",
			   "pre_isCurrentAndVoltage", "(self.left.type() = Type::Voltage and self.right.type() = Type::Current) or (self.right.type() = Type::Current and self.left.type() = Type::Voltage)"
		   });
		addAnnotation
		  (getNormalDistribution_MeanValue(),
		   source,
		   new String[] {
			   "derivation", "Measure.allInstances()->select(v |\n\t\t\t\t\tv.uncertainty = (MeasurementUncertainty.allInstances()->select(u |\n\t\t\t\t\t\tu.information = self)->asOrderedSet()->first()))->asOrderedSet()->first().value()"
		   });
		addAnnotation
		  (getNormalDistribution_StandardDeviation(),
		   source,
		   new String[] {
			   "derivation", "MeasurementUncertainty.allInstances()->select(u |\n\t\t\t\t\t\tu.information = self)->asOrderedSet()->first().standardUncertainty"
		   });
	}

} //EelPackageImpl

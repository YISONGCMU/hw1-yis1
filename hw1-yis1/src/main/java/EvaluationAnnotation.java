

/* First created by JCasGen Wed Sep 11 20:39:50 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;


/** Output the Answer by the value of answer score
and the Precision at N.
 * Updated by JCasGen Wed Sep 11 21:04:49 EDT 2013
 * XML source: C:/Users/sy/git/hw1-yis1/hw1-yis1/src/main/resources/hw1-yis1-typesystem.xml
 * @generated */
public class EvaluationAnnotation extends FSList {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluationAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EvaluationAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluationAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluationAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets The answer score precision at N (where N is the total number of correct answers)
   * @generated */
  public double getPrecision() {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "EvaluationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets The answer score precision at N (where N is the total number of correct answers) 
   * @generated */
  public void setPrecision(double v) {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "EvaluationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: AnswerNumberN

  /** getter for AnswerNumberN - gets Total answer number.
   * @generated */
  public int getAnswerNumberN() {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_AnswerNumberN == null)
      jcasType.jcas.throwFeatMissing("AnswerNumberN", "EvaluationAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_AnswerNumberN);}
    
  /** setter for AnswerNumberN - sets Total answer number. 
   * @generated */
  public void setAnswerNumberN(int v) {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_AnswerNumberN == null)
      jcasType.jcas.throwFeatMissing("AnswerNumberN", "EvaluationAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_AnswerNumberN, v);}    
   
    
  //*--------------*
  //* Feature: elements

  /** getter for elements - gets the output of the evaluation step.
Answer Annotations are ranked by the answer score.
   * @generated */
  public FSArray getElements() {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "EvaluationAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets the output of the evaluation step.
Answer Annotations are ranked by the answer score. 
   * @generated */
  public void setElements(FSArray v) {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "EvaluationAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - the output of the evaluation step.
Answer Annotations are ranked by the answer score. 
   * @generated */
  public AnswerScoreAnnotation getElements(int i) {
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "EvaluationAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements), i);
    return (AnswerScoreAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - the output of the evaluation step.
Answer Annotations are ranked by the answer score. 
   * @generated */
  public void setElements(int i, AnswerScoreAnnotation v) { 
    if (EvaluationAnnotation_Type.featOkTst && ((EvaluationAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "EvaluationAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationAnnotation_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    
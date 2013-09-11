

/* First created by JCasGen Tue Sep 10 22:07:31 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 22:09:35 EDT 2013
 * XML source: C:/Users/sy/git/hw1-yis1/hw1-yis1/src/main/resources/hw1-yis1-typesystem.xml
 * @generated */
public class TokenAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenAnnotation.class);
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
  protected TokenAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated */
  public double getConfidence() {
    if (TokenAnnotation_Type.featOkTst && ((TokenAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "TokenAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TokenAnnotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets  
   * @generated */
  public void setConfidence(double v) {
    if (TokenAnnotation_Type.featOkTst && ((TokenAnnotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "TokenAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TokenAnnotation_Type)jcasType).casFeatCode_confidence, v);}    
   
    
  //*--------------*
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets 
   * @generated */
  public String getCasProcessorId() {
    if (TokenAnnotation_Type.featOkTst && ((TokenAnnotation_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "TokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TokenAnnotation_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets  
   * @generated */
  public void setCasProcessorId(String v) {
    if (TokenAnnotation_Type.featOkTst && ((TokenAnnotation_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "TokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((TokenAnnotation_Type)jcasType).casFeatCode_casProcessorId, v);}    
  }

    


/* First created by JCasGen Tue Sep 10 22:07:31 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Sep 11 20:57:30 EDT 2013
 * XML source: C:/Users/sy/git/hw1-yis1/hw1-yis1/src/main/resources/hw1-yis1-typesystem.xml
 * @generated */
public class NGramAnnotation extends TokenAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramAnnotation.class);
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
  protected NGramAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: elements

  /** getter for elements - gets The elements of NGramAnnotation, which are tokens of TokenAnnotation type.
   * @generated */
  public FSArray getElements() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets The elements of NGramAnnotation, which are tokens of TokenAnnotation type. 
   * @generated */
  public void setElements(FSArray v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated */
  public TokenAnnotation getElements(int i) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements), i);
    return (TokenAnnotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - 
   * @generated */
  public void setElements(int i, TokenAnnotation v) { 
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "NGramAnnotation");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: elementType

  /** getter for elementType - gets Describe the element type of NGramAnnotation, which should be TokenAnnotation.
   * @generated */
  public String getElementType() {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "NGramAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elementType);}
    
  /** setter for elementType - sets Describe the element type of NGramAnnotation, which should be TokenAnnotation. 
   * @generated */
  public void setElementType(String v) {
    if (NGramAnnotation_Type.featOkTst && ((NGramAnnotation_Type)jcasType).casFeat_elementType == null)
      jcasType.jcas.throwFeatMissing("elementType", "NGramAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramAnnotation_Type)jcasType).casFeatCode_elementType, v);}    
  }

    
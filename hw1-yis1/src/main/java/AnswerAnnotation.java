

/* First created by JCasGen Tue Sep 10 22:07:30 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 20:57:30 EDT 2013
 * XML source: C:/Users/sy/git/hw1-yis1/hw1-yis1/src/main/resources/hw1-yis1-typesystem.xml
 * @generated */
public class AnswerAnnotation extends TokenAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerAnnotation.class);
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
  protected AnswerAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: isCorrect

  /** getter for isCorrect - gets The boolean value of whether the answer is correct.
   * @generated */
  public boolean getIsCorrect() {
    if (AnswerAnnotation_Type.featOkTst && ((AnswerAnnotation_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "AnswerAnnotation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AnswerAnnotation_Type)jcasType).casFeatCode_isCorrect);}
    
  /** setter for isCorrect - sets The boolean value of whether the answer is correct. 
   * @generated */
  public void setIsCorrect(boolean v) {
    if (AnswerAnnotation_Type.featOkTst && ((AnswerAnnotation_Type)jcasType).casFeat_isCorrect == null)
      jcasType.jcas.throwFeatMissing("isCorrect", "AnswerAnnotation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AnswerAnnotation_Type)jcasType).casFeatCode_isCorrect, v);}    
  }

    
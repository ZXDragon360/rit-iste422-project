import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest{
EdgeField field;

@Before
public void initiate(){
    field = new EdgeField("3|Grade");
}

@Test
public void test_getNumFigure(){
    assertEquals("Test number figure to 3", 3, field.getNumFigure());
}

@Test
public void test_getName(){
    assertEquals("Test name to grade", "Grade", field.getName());
}

@Test
public void test_TableID(){
    assertEquals("Test get table id to 0", 0, field.getTableID());
}

@Test
public void test_getTableBound(){
    assertEquals("Test table bound to 0", 0, field.getTableBound());
}

@Test
public void test_getDisallowNull(){
    assertEquals("Test disallow for null to false", false, field.getDisallowNull());
}

@Test
public void test_PrimaryKey(){
    assertEquals("Test checking primary key to false", false, field.getIsPrimaryKey());
}

@Test
public void test_DefaultValue(){
    assertEquals("Test default value set to empty", "", field.getDefaultValue());
}

@Test
public void test_VarcharValue(){
    assertEquals("test varchar value to 1", 1, field.getVarcharValue());
}

@Test
public void test_DataType(){
    assertEquals("Test data type to 0", 0, field.getDataType());
}

@Test
public void test_setTableId(){
    field.setTableID(1);
    assertEquals("Test set table id to 1", 1, field.getTableID());
}

@Test
public void test_setTableBound(){
    field.setTableBound(1);
    assertEquals("Test set table bound to 1", 1, field.getTableBound());
}

@Test
public void test_setDisallowNull(){
    field.setDisallowNull(true);
    assertEquals("Test set the disallow of null to true", true, field.getDisallowNull());
}

@Test
public void test_setIsPrimaryKey(){
    field.setIsPrimaryKey(true);
    assertEquals("Test set primary key to true", true, field.getIsPrimaryKey());
}

@Test
public void test_setDefaultValue(){
    field.setDefaultValue("unit");
    assertEquals("Test set default value to unit", "unit", field.getDefaultValue());
}

@Test
public void test_setVarcharType(){
    field.setVarcharValue(3);
    assertEquals("Test set varchar type to 3", 3, field.getVarcharValue());
}
}
package samples.employeedirectory;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "universityMap_directory";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		    
		/*
		 * Create the employee table and populate it with sample data.
		 * In step 6, we will move these hardcoded statements to an XML document.
		 */
		String sql = "CREATE TABLE IF NOT EXISTS universityName (" +
						"_id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
						"buildingName TEXT, " +
						"buildingDetails TEXT, " +
						"managerId INTEGER)";
		db.execSQL(sql);
		
		ContentValues values = new ContentValues();

		values.put("buildingName", "Enginery and ComputerScience");
		values.put("buildingDetails", "پوهنڅی  انجینری  وکمپیوترساینس");
		db.insert("universityName", "", values);
		

		values.put("buildingName", "Economy and Science");
		values.put("buildingDetails", "پوهنڅی   اقتصاد  وساینس");
		db.insert("universityName", "", values);
		
		
		values.put("buildingName", "Zaraat and Viternary");
		values.put("buildingDetails", "پوهنڅی   زراعت  ووترنری");
		db.insert("universityName", "", values);
		
		
		values.put("buildingName", "Sharyat");
		values.put("buildingDetails", "پوهنڅی   شرعیات");
		db.insert("universityName", "", values);
		
		
		values.put("buildingName", "Law and Medicine");
		values.put("buildingDetails", "پوهنڅی  حقوق  وطب");
		db.insert("universityName", "", values);
		
		//
		values.put("buildingName", "Jornalism");
		values.put("buildingDetails", "پوهنڅی   ژورنالیزم");
		db.insert("universityName", "", values);
		
		
		values.put("buildingName", "Public presidency");
		values.put("buildingDetails", "پوهنڅی   ریاست  عمومی");
		db.insert("universityName", "", values);
		
		//
		values.put("buildingName", "Honarha and Public office");
		values.put("buildingDetails", "پوهنڅی   هنرها  واداره عامه");
		db.insert("universityName", "", values);
		
		//
		values.put("buildingName", "Literature and Sosity shanasi");
		values.put("buildingDetails", "پوهنڅی    ادبیات  وجامعه شناسی");
		db.insert("universityName", "", values);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS building");
		onCreate(db);
	}
	
}

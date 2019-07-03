package com.yuren.file.c60;

import com.yuren.file.c57.Student;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Created with Intellij IDEA.
 * Description:
 *
 * @author lujiang
 * @date 2019-07-03 23:21
 */
public class StudentDB {

    private static byte[] toBytes(Student student) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(bout);
        dout.writeUTF(student.getName());
        dout.writeInt(student.getAge());
        dout.writeDouble(student.getScore());
        return bout.toByteArray();
    }

    public static void saveStudents(Map<String, Student> students)
            throws IOException {
        BasicDB db = new BasicDB("./", "students");
        for (Map.Entry<String, Student> kv : students.entrySet()) {
            db.put(kv.getKey(), toBytes(kv.getValue()));
        }
        db.close();
    }


}

package dal.csci5308.project.group15.elearning.persistence;

import dal.csci5308.project.group15.elearning.database.Database;
import dal.csci5308.project.group15.elearning.persistence.mockdbpersistence.MockDBCourseInstancePersistence;
import dal.csci5308.project.group15.elearning.persistence.mysqlpersistence.MySqlCourseInstancePersistence;

public class CourseInstancePersistenceSingleton {
    private static Database database_;
    private static MySqlCourseInstancePersistence mySqlCourseInstancePersistenceInstance_;
    private  static MockDBCourseInstancePersistence mockDBCourseInstancePersistenceInstance_;

    private static MySqlCourseInstancePersistence CreateMySqlCoursePersistence(){
        return  new MySqlCourseInstancePersistence(database_);
    }
    private static MockDBCourseInstancePersistence CreateMockDBCoursePersistence(){
        return  new MockDBCourseInstancePersistence();
    }

    private CourseInstancePersistenceSingleton(){
        database_ = null;
        mockDBCourseInstancePersistenceInstance_ = null;
        mySqlCourseInstancePersistenceInstance_ = null;
    }

    public static CourseInstancePersistence GetMySqlCourseInstancePersistenceInstance() {
        database_ = Database.instance();

        if(mySqlCourseInstancePersistenceInstance_ == null){
            mySqlCourseInstancePersistenceInstance_ = CreateMySqlCoursePersistence();
        }
        return mySqlCourseInstancePersistenceInstance_;
    }

    public static CourseInstancePersistence GetMockDBCourseInstancePersistenceInstance(){
        if(mockDBCourseInstancePersistenceInstance_ == null){
           mockDBCourseInstancePersistenceInstance_ = CreateMockDBCoursePersistence();
        }
        return mockDBCourseInstancePersistenceInstance_;
    }
}

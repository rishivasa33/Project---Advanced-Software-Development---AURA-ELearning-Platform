package dal.csci5308.project.group15.elearning.models.terms;

import dal.csci5308.project.group15.elearning.persistence.terms.IUniversityTermsPersistence;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IUniversityTerms {

    void save(IUniversityTermsPersistence iUniversityTermsPersistence) throws SQLException;

    ArrayList<IUniversityTerms> loadTermsAfterCurrentDate(IUniversityTermsPersistence iUniversityTermsPersistence, Date currentDate);

    ArrayList<IUniversityTerms> loadOpenForRegistrationTerms(IUniversityTermsPersistence iUniversityTermsPersistence, Date currentDate);

    ArrayList<IUniversityTerms> loadCurrentTerm(IUniversityTermsPersistence iUniversityTermsPersistence, Date currentDate);
}

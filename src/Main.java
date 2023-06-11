
import Model.Company;
import ServiceIMPL.CompanyIMPL;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // insert

        // delete();

        // getObject();
        getObjectList();
    }

    private static void insert() {
        Company company = new Company();
        company.setCompanyGUID(UUID.randomUUID());
        company.setName("Co-Name5");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.US);  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
        LocalDate date = LocalDate.parse("2020-07-10", formatter);
        company.setStartActivityDate(date);

        CompanyIMPL companyIMPL = new CompanyIMPL();

        company = companyIMPL.insert(company);
        System.out.println("New company inserted");
        System.out.println("New ID: " + company.getCompanyID());
    }

    private static void delete() {
        CompanyIMPL companyIMPL = new CompanyIMPL();
        companyIMPL.delete(5);
        //companyIMPL.delete(UUID.fromString("a49b4bf1-3bb7-40ad-887c-eef9f970b845")); // delete with guid
        //companyIMPL.delete("Name = \"Co-Name5\""); // delete with guid

        System.out.println("Company with ID=5 deleted");
    }

    private static void getObject() {
        CompanyIMPL companyIMPL = new CompanyIMPL();
        //companyIMPL.getObject(UUID.fromString("a49b4bf1-3bb7-40ad-887c-eef9f970b845"));
        //companyIMPL.getObject("Name = \"Co-Name5\"");

        Company company = companyIMPL.getObject(5);
        System.out.println("Company with ID=5 fetched");
        System.out.println("Company name: "+ company.getName());
    }

    private static void getObjectList() {
        CompanyIMPL companyIMPL = new CompanyIMPL();

        List<Company> companies = companyIMPL.getObjectList("Name like \"Co-Name%\"");
        System.out.println("Company list fetched with: criteria= Name like Co-Name%");
        for(Company company: companies){
            System.out.println("Company name: "+ company.getName());
        }

    }
}
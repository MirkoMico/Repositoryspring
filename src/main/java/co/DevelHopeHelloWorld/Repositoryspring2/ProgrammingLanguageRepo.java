package co.DevelHopeHelloWorld.Repositoryspring2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "programmingLanguages",
        collectionResourceDescription =@Description("This is the description"))

public interface ProgrammingLanguageRepo extends JpaRepository<ProgrammingLanguage, Long> {
}

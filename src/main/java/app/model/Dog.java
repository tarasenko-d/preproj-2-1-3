package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DogComp")
@Setter
@Getter
@AllArgsConstructor
public class Dog extends Animal{

    @Override
    public String toString() {
        return "Im a Dog";
    }
}

package rewards

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class CustomerSpec extends Specification implements DomainUnitTest<Customer> {

    @Shared int id

    void "test basic persistence mocking"() {
        setup:
        new Customer (firstName: 'Robert', lastName: 'Fripp').save()
        new Customer (firstName: 'Adrian', lastName: 'Belew').save()

        expect:
        Customer.count() == 2
    }



}

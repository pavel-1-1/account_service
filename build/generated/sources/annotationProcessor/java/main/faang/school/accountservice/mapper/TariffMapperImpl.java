package faang.school.accountservice.mapper;

import faang.school.accountservice.dto.tariff.TariffDto;
import faang.school.accountservice.model.Tariff;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T14:39:14+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class TariffMapperImpl implements TariffMapper {

    @Override
    public TariffDto tariffToTariffDto(Tariff tariff) {
        if ( tariff == null ) {
            return null;
        }

        TariffDto tariffDto = new TariffDto();

        tariffDto.setTypeTariff( tariff.getTypeTariff() );
        tariffDto.setBet( tariff.getBet() );
        tariffDto.setBettingHistory( tariff.getBettingHistory() );

        return tariffDto;
    }
}

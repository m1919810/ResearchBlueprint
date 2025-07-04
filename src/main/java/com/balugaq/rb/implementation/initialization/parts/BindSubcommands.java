package com.balugaq.rb.implementation.initialization.parts;

import com.balugaq.rb.api.cfgparse.annotations.IDefaultValue;
import com.balugaq.rb.api.cfgparse.annotations.Key;
import com.balugaq.rb.api.cfgparse.annotations.IParsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BindSubcommands implements IDefaultValue<BindSubcommands>, IParsable {
    static final BindSubcommands DEFAULT = new BindSubcommands(List.of());

    @Key("subcommands")
    List<String> subcommands;

    public static String[] fieldNames() {
        return IParsable.fieldNames(BindSubcommands.class);
    }

    public static BindSubcommands defaultValue0() {
        return DEFAULT;
    }

    @Override
    public BindSubcommands defaultValue() {
        return defaultValue0();
    }
}

package org.zalando.intellij.swagger.completion.field.model.common;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class CommonFields {

    public static List<Field> info() {
        return ImmutableList.of(
                new StringField("title", true),
                new StringField("description"),
                new StringField("termsOfService"),
                new ContactField(),
                new LicenseField(),
                new StringField("version", true)
        );
    }

    public static List<Field> tag() {
        return ImmutableList.of(
                new StringField("name", true),
                new StringField("description"),
                new ExternalDocsField()
        );
    }

    public static List<Field> externalDocs() {
        return ImmutableList.of(
                new StringField("url", true),
                new StringField("description")
        );
    }

}

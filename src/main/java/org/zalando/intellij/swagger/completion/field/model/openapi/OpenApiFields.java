package org.zalando.intellij.swagger.completion.field.model.openapi;

import com.google.common.collect.ImmutableList;
import org.zalando.intellij.swagger.completion.field.model.common.*;

import java.util.List;

public class OpenApiFields {

    public static List<Field> root() {
        return ImmutableList.of(
                new StringField("openapi", true),
                new InfoField(),
                new ArrayField("servers"),
                new ObjectField("paths", true),
                new ObjectField("components"),
                new ArrayField("security"),
                new ArrayField("tags"),
                new ExternalDocsField()
        );
    }

    public static List<Field> server() {
        return ImmutableList.of(
                new StringField("url", true),
                new StringField("description"),
                new ObjectField("variables")
        );
    }

    public static List<Field> serverVariable() {
        return ImmutableList.of(
                new ArrayField("enum"),
                new StringField("default", true),
                new StringField("description")
        );
    }

    public static List<Field> path() {
        return ImmutableList.of(
                new RefField(),
                new StringField("summary"),
                new StringField("description"),
                new OperationField("get"),
                new OperationField("put"),
                new OperationField("post"),
                new OperationField("delete"),
                new OperationField("options"),
                new OperationField("head"),
                new OperationField("patch"),
                new OperationField("trace"),
                new ArrayField("servers"),
                new ArrayField("parameters")
        );
    }

    public static List<Field> operation() {
        return ImmutableList.of(
                new ArrayField("tags"),
                new StringField("summary"),
                new StringField("description"),
                new ExternalDocsField(),
                new StringField("operationId"),
                new ArrayField("parameters"),
                new ObjectField("requestBody"),
                new ObjectField("responses", true),
                new ObjectField("callbacks"),
                new StringField("deprecated"),
                new ArrayField("security"),
                new ArrayField("servers")
        );
    }

    public static List<Field> parameter() {
        return ImmutableList.of(
                new RefField(),
                new StringField("name", true),
                new StringField("in", true),
                new StringField("description"),
                new StringField("required"),
                new StringField("deprecated"),
                new StringField("allowEmptyValue"),
                new StringField("style"),
                new StringField("explode"),
                new StringField("allowReserved"),
                new ObjectField("schema"),
                new StringField("example"),
                new ObjectField("examples"),
                new ObjectField("content")
        );
    }

    public static List<Field> component() {
        return ImmutableList.of(
                new ObjectField("schemas"),
                new ObjectField("responses"),
                new ObjectField("parameters"),
                new ObjectField("examples"),
                new ObjectField("requestBodies"),
                new ObjectField("headers"),
                new ObjectField("securitySchemes"),
                new ObjectField("links"),
                new ObjectField("callbacks")
        );
    }
}

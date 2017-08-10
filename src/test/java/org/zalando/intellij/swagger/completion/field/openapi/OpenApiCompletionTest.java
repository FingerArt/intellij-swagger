package org.zalando.intellij.swagger.completion.field.openapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.zalando.intellij.swagger.completion.JsonAndYamlCompletionTest;
import org.zalando.intellij.swagger.fixture.Format;

@RunWith(Parameterized.class)
public class OpenApiCompletionTest extends JsonAndYamlCompletionTest {

    public OpenApiCompletionTest(Format format) {
        super(format, "testing/completion/field/openapi/");
    }

    @Parameterized.Parameters(name = "inputKind: {0}")
    public static Object[] parameters() {
        return Format.values();
    }

    @Test
    public void thatRootKeysAreSuggested() {
        getCaretCompletions("root")
                .assertContains("info", "servers", "paths", "components", "security", "tags", "externalDocs")
                .isOfSize(7);
    }

    @Test
    public void thatInfoKeysAreSuggested() {
        getCaretCompletions("info")
                .assertContains("title", "description", "termsOfService", "contact", "license", "version")
                .isOfSize(6);
    }

    @Test
    public void thatServerKeysAreSuggested() {
        getCaretCompletions("servers")
                .assertContains("url", "description", "variables")
                .isOfSize(3);
    }

    @Test
    public void thatServerVariableKeysAreSuggested() {
        getCaretCompletions("server_variable")
                .assertContains("enum", "default", "description")
                .isOfSize(3);
    }

    @Test
    public void thatPathKeysAreSuggested() {
        getCaretCompletions("path")
                .assertContains("$ref", "description", "summary", "get", "put", "post", "delete", "options", "head",
                        "patch", "trace", "servers", "parameters")
                .isOfSize(13);
    }

    @Test
    public void thatOperationKeysAreSuggested() {
        getCaretCompletions("operation")
                .assertContains("tags", "summary", "description", "externalDocs", "operationId", "parameters",
                        "requestBody", "responses", "callbacks", "deprecated", "security", "servers")
                .isOfSize(12);
    }

    @Test
    public void thatParameterKeysAreSuggested() {
        getCaretCompletions("parameter")
                .assertContains("$ref", "name", "in", "description", "required", "deprecated", "allowEmptyValue",
                        "style", "explode", "allowReserved", "schema", "example", "examples", "content")
                .isOfSize(14);
    }

    @Test
    public void thatComponentKeysAreSuggested() {
        getCaretCompletions("component")
                .assertContains("schemas", "responses", "parameters", "examples", "requestBodies", "headers",
                        "securitySchemes", "links", "callbacks")
                .isOfSize(9);
    }
}

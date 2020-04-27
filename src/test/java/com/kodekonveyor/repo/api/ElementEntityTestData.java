package com.kodekonveyor.repo.api;


public class ElementEntityTestData {

  public static ElementEntity get() {

    final ElementEntity element = new ElementEntity();
    element.setCommit("foundLocalCommit");
    element.setSource("sourceFoundLocal");
    element.setTarget("targetFoundLocal");
    element.setId(ElementDTOTestData.FOUND_LOCAL_ID);

    return element;

  }

  public static ElementEntity getWithWrongSyntax() {
    final ElementEntity element = new ElementEntity();
    element.setCommit("syntaxCommit");
    element.setSource("syntax");
    element.setTarget("syntax");
    element.setId(ElementDTOTestData.SYNTAX_ID);

    return element;
  }

  public static ElementEntity getFoundServer() {
    final ElementEntity element = new ElementEntity();
    element.setCommit("foundServerCommit");
    element.setSource("sourceFoundServer");
    element.setTarget("targetFoundServer");
    element.setId(ElementDTOTestData.FOUND_SERVER_ID);

    return element;

  }

  public static ElementEntity getRemote() {
    final ElementEntity element =  new ElementEntity();
    element.setCommit("remoteCommit");
    element.setSource("sourceRemote");
    element.setTarget("targetRemote");
    element.setId(ElementDTOTestData.REMOTE_ID);

    return element;
  }

  public static ElementEntity getNotFoundLocal() {
    final ElementEntity element = new ElementEntity();
    element.setCommit("notFoundLocalCommit");
    element.setSource("sourceNotFoundLocal");
    element.setTarget("targetNotFoundLocal");
    element.setId(ElementDTOTestData.NOT_FOUND_LOCAL_ID);

    return element;
  }

  public static ElementEntity getNotFoundServer() {
    final ElementEntity element = new ElementEntity();
    element.setCommit("notFoundServerCommit");
    element.setSource("sourceNotFoundServer");
    element.setTarget("targetNotFoundServer");
    element.setId(ElementDTOTestData.NOT_FOUND_SERVER_ID);

    return element;
  }

}

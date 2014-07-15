
package com.nttdata.sf.tooling;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nttdata.sf.tooling package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvalidFieldFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidFieldFault");
    private final static QName _MalformedSearchFault_QNAME = new QName("urn:tooling.soap.sforce.com", "MalformedSearchFault");
    private final static QName _MalformedQueryFault_QNAME = new QName("urn:tooling.soap.sforce.com", "MalformedQueryFault");
    private final static QName _InvalidIdFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidIdFault");
    private final static QName _InvalidSObjectFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidSObjectFault");
    private final static QName _ApiFault_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiFault");
    private final static QName _InvalidNewPasswordFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidNewPasswordFault");
    private final static QName _InvalidQueryLocatorFault_QNAME = new QName("urn:tooling.soap.sforce.com", "InvalidQueryLocatorFault");
    private final static QName _LoginFault_QNAME = new QName("urn:tooling.soap.sforce.com", "LoginFault");
    private final static QName _ApiQueryFault_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiQueryFault");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:tooling.soap.sforce.com", "UnexpectedErrorFault");
    private final static QName _WorkflowFieldUpdateSourceTableEnumOrId_QNAME = new QName("urn:tooling.soap.sforce.com", "SourceTableEnumOrId");
    private final static QName _WorkflowFieldUpdateName_QNAME = new QName("urn:tooling.soap.sforce.com", "Name");
    private final static QName _WorkflowFieldUpdateNamespacePrefix_QNAME = new QName("urn:tooling.soap.sforce.com", "NamespacePrefix");
    private final static QName _WorkflowFieldUpdateLastModifiedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedDate");
    private final static QName _ValidationRuleFullName_QNAME = new QName("urn:tooling.soap.sforce.com", "FullName");
    private final static QName _ValidationRuleValidationName_QNAME = new QName("urn:tooling.soap.sforce.com", "ValidationName");
    private final static QName _ValidationRuleTableEnumOrId_QNAME = new QName("urn:tooling.soap.sforce.com", "TableEnumOrId");
    private final static QName _ValidationRuleMetadata_QNAME = new QName("urn:tooling.soap.sforce.com", "Metadata");
    private final static QName _ApexPageMemberSystemModstamp_QNAME = new QName("urn:tooling.soap.sforce.com", "SystemModstamp");
    private final static QName _ApexPageMemberCreatedById_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedById");
    private final static QName _ApexPageMemberMetadataContainerId_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerId");
    private final static QName _ApexPageMemberContent_QNAME = new QName("urn:tooling.soap.sforce.com", "Content");
    private final static QName _ApexPageMemberContentEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentEntity");
    private final static QName _ApexPageMemberCreatedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedBy");
    private final static QName _ApexPageMemberCreatedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CreatedDate");
    private final static QName _ApexPageMemberIsDeleted_QNAME = new QName("urn:tooling.soap.sforce.com", "IsDeleted");
    private final static QName _ApexPageMemberLastModifiedById_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedById");
    private final static QName _ApexPageMemberBody_QNAME = new QName("urn:tooling.soap.sforce.com", "Body");
    private final static QName _ApexPageMemberContentEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentEntityId");
    private final static QName _ApexPageMemberLastModifiedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "LastModifiedBy");
    private final static QName _ApexPageMemberMetadataContainer_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainer");
    private final static QName _ApexPageMemberLastSyncDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastSyncDate");
    private final static QName _ApexExecutionOverlayActionExecutableEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "ExecutableEntity");
    private final static QName _ApexExecutionOverlayActionScope_QNAME = new QName("urn:tooling.soap.sforce.com", "Scope");
    private final static QName _ApexExecutionOverlayActionLine_QNAME = new QName("urn:tooling.soap.sforce.com", "Line");
    private final static QName _ApexExecutionOverlayActionActionScript_QNAME = new QName("urn:tooling.soap.sforce.com", "ActionScript");
    private final static QName _ApexExecutionOverlayActionIteration_QNAME = new QName("urn:tooling.soap.sforce.com", "Iteration");
    private final static QName _ApexExecutionOverlayActionExpirationDate_QNAME = new QName("urn:tooling.soap.sforce.com", "ExpirationDate");
    private final static QName _ApexExecutionOverlayActionScopeId_QNAME = new QName("urn:tooling.soap.sforce.com", "ScopeId");
    private final static QName _ApexExecutionOverlayActionExecutableEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "ExecutableEntityId");
    private final static QName _ApexExecutionOverlayActionIsDumpingHeap_QNAME = new QName("urn:tooling.soap.sforce.com", "IsDumpingHeap");
    private final static QName _ApexExecutionOverlayActionActionScriptType_QNAME = new QName("urn:tooling.soap.sforce.com", "ActionScriptType");
    private final static QName _IDEWorkspaceUser_QNAME = new QName("urn:tooling.soap.sforce.com", "User");
    private final static QName _IDEWorkspaceUserId_QNAME = new QName("urn:tooling.soap.sforce.com", "UserId");
    private final static QName _ApexPageControllerType_QNAME = new QName("urn:tooling.soap.sforce.com", "ControllerType");
    private final static QName _ApexPageIsConfirmationTokenRequired_QNAME = new QName("urn:tooling.soap.sforce.com", "IsConfirmationTokenRequired");
    private final static QName _ApexPageControllerKey_QNAME = new QName("urn:tooling.soap.sforce.com", "ControllerKey");
    private final static QName _ApexPageIsAvailableInTouch_QNAME = new QName("urn:tooling.soap.sforce.com", "IsAvailableInTouch");
    private final static QName _ApexPageDescription_QNAME = new QName("urn:tooling.soap.sforce.com", "Description");
    private final static QName _ApexPageApiVersion_QNAME = new QName("urn:tooling.soap.sforce.com", "ApiVersion");
    private final static QName _ApexPageMasterLabel_QNAME = new QName("urn:tooling.soap.sforce.com", "MasterLabel");
    private final static QName _ApexPageMarkup_QNAME = new QName("urn:tooling.soap.sforce.com", "Markup");
    private final static QName _UserPreferenceValue_QNAME = new QName("urn:tooling.soap.sforce.com", "Value");
    private final static QName _UserPreferencePreference_QNAME = new QName("urn:tooling.soap.sforce.com", "Preference");
    private final static QName _ApexTriggerIsValid_QNAME = new QName("urn:tooling.soap.sforce.com", "IsValid");
    private final static QName _ApexTriggerUsageAfterInsert_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterInsert");
    private final static QName _ApexTriggerStatus_QNAME = new QName("urn:tooling.soap.sforce.com", "Status");
    private final static QName _ApexTriggerLengthWithoutComments_QNAME = new QName("urn:tooling.soap.sforce.com", "LengthWithoutComments");
    private final static QName _ApexTriggerUsageBeforeInsert_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeInsert");
    private final static QName _ApexTriggerUsageIsBulk_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageIsBulk");
    private final static QName _ApexTriggerBodyCrc_QNAME = new QName("urn:tooling.soap.sforce.com", "BodyCrc");
    private final static QName _ApexTriggerUsageBeforeDelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeDelete");
    private final static QName _ApexTriggerUsageBeforeUpdate_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageBeforeUpdate");
    private final static QName _ApexTriggerUsageAfterUpdate_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterUpdate");
    private final static QName _ApexTriggerUsageAfterDelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterDelete");
    private final static QName _ApexTriggerUsageAfterUndelete_QNAME = new QName("urn:tooling.soap.sforce.com", "UsageAfterUndelete");
    private final static QName _ApexTriggerMemberSymbolTable_QNAME = new QName("urn:tooling.soap.sforce.com", "SymbolTable");
    private final static QName _StaticResourceCacheControl_QNAME = new QName("urn:tooling.soap.sforce.com", "CacheControl");
    private final static QName _StaticResourceContentType_QNAME = new QName("urn:tooling.soap.sforce.com", "ContentType");
    private final static QName _StaticResourceBodyLength_QNAME = new QName("urn:tooling.soap.sforce.com", "BodyLength");
    private final static QName _AggregateExpressionResultColumnMetadataDisplayName_QNAME = new QName("urn:tooling.soap.sforce.com", "displayName");
    private final static QName _NameUsername_QNAME = new QName("urn:tooling.soap.sforce.com", "Username");
    private final static QName _NameAlias_QNAME = new QName("urn:tooling.soap.sforce.com", "Alias");
    private final static QName _NameEmail_QNAME = new QName("urn:tooling.soap.sforce.com", "Email");
    private final static QName _NameIsActive_QNAME = new QName("urn:tooling.soap.sforce.com", "IsActive");
    private final static QName _NameLastViewedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastViewedDate");
    private final static QName _NameFirstName_QNAME = new QName("urn:tooling.soap.sforce.com", "FirstName");
    private final static QName _NameType_QNAME = new QName("urn:tooling.soap.sforce.com", "Type");
    private final static QName _NamePhone_QNAME = new QName("urn:tooling.soap.sforce.com", "Phone");
    private final static QName _NameRecordTypeId_QNAME = new QName("urn:tooling.soap.sforce.com", "RecordTypeId");
    private final static QName _NameUserRoleId_QNAME = new QName("urn:tooling.soap.sforce.com", "UserRoleId");
    private final static QName _NameLastReferencedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "LastReferencedDate");
    private final static QName _NameTitle_QNAME = new QName("urn:tooling.soap.sforce.com", "Title");
    private final static QName _NameLastName_QNAME = new QName("urn:tooling.soap.sforce.com", "LastName");
    private final static QName _NameProfileId_QNAME = new QName("urn:tooling.soap.sforce.com", "ProfileId");
    private final static QName _WorkflowTaskSubject_QNAME = new QName("urn:tooling.soap.sforce.com", "Subject");
    private final static QName _ApexOrgWideCoveragePercentCovered_QNAME = new QName("urn:tooling.soap.sforce.com", "PercentCovered");
    private final static QName _TraceFlagTracedEntityId_QNAME = new QName("urn:tooling.soap.sforce.com", "TracedEntityId");
    private final static QName _TraceFlagApexCode_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexCode");
    private final static QName _TraceFlagSystem_QNAME = new QName("urn:tooling.soap.sforce.com", "System");
    private final static QName _TraceFlagCallout_QNAME = new QName("urn:tooling.soap.sforce.com", "Callout");
    private final static QName _TraceFlagDatabase_QNAME = new QName("urn:tooling.soap.sforce.com", "Database");
    private final static QName _TraceFlagWorkflow_QNAME = new QName("urn:tooling.soap.sforce.com", "Workflow");
    private final static QName _TraceFlagVisualforce_QNAME = new QName("urn:tooling.soap.sforce.com", "Visualforce");
    private final static QName _TraceFlagValidation_QNAME = new QName("urn:tooling.soap.sforce.com", "Validation");
    private final static QName _TraceFlagApexProfiling_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexProfiling");
    private final static QName _TraceFlagTracedEntity_QNAME = new QName("urn:tooling.soap.sforce.com", "TracedEntity");
    private final static QName _ApexCodeCoverageApexClassOrTrigger_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassOrTrigger");
    private final static QName _ApexCodeCoverageCoverage_QNAME = new QName("urn:tooling.soap.sforce.com", "Coverage");
    private final static QName _ApexCodeCoverageApexTestClass_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexTestClass");
    private final static QName _ApexCodeCoverageApexTestClassId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexTestClassId");
    private final static QName _ApexCodeCoverageTestMethodName_QNAME = new QName("urn:tooling.soap.sforce.com", "TestMethodName");
    private final static QName _ApexCodeCoverageApexClassOrTriggerId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassOrTriggerId");
    private final static QName _ApexCodeCoverageNumLinesCovered_QNAME = new QName("urn:tooling.soap.sforce.com", "NumLinesCovered");
    private final static QName _ApexCodeCoverageNumLinesUncovered_QNAME = new QName("urn:tooling.soap.sforce.com", "NumLinesUncovered");
    private final static QName _AsyncApexJobExtendedStatus_QNAME = new QName("urn:tooling.soap.sforce.com", "ExtendedStatus");
    private final static QName _AsyncApexJobMethodName_QNAME = new QName("urn:tooling.soap.sforce.com", "MethodName");
    private final static QName _AsyncApexJobNumberOfErrors_QNAME = new QName("urn:tooling.soap.sforce.com", "NumberOfErrors");
    private final static QName _AsyncApexJobJobType_QNAME = new QName("urn:tooling.soap.sforce.com", "JobType");
    private final static QName _AsyncApexJobCompletedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CompletedDate");
    private final static QName _AsyncApexJobApexClass_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClass");
    private final static QName _AsyncApexJobJobItemsProcessed_QNAME = new QName("urn:tooling.soap.sforce.com", "JobItemsProcessed");
    private final static QName _AsyncApexJobLastProcessed_QNAME = new QName("urn:tooling.soap.sforce.com", "LastProcessed");
    private final static QName _AsyncApexJobParentJobId_QNAME = new QName("urn:tooling.soap.sforce.com", "ParentJobId");
    private final static QName _AsyncApexJobApexClassId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexClassId");
    private final static QName _AsyncApexJobTotalJobItems_QNAME = new QName("urn:tooling.soap.sforce.com", "TotalJobItems");
    private final static QName _AsyncApexJobLastProcessedOffset_QNAME = new QName("urn:tooling.soap.sforce.com", "LastProcessedOffset");
    private final static QName _ApexExecutionOverlayResultOverlayResultLength_QNAME = new QName("urn:tooling.soap.sforce.com", "OverlayResultLength");
    private final static QName _ApexExecutionOverlayResultClassName_QNAME = new QName("urn:tooling.soap.sforce.com", "ClassName");
    private final static QName _ApexExecutionOverlayResultNamespace_QNAME = new QName("urn:tooling.soap.sforce.com", "Namespace");
    private final static QName _ApexExecutionOverlayResultRequestedBy_QNAME = new QName("urn:tooling.soap.sforce.com", "RequestedBy");
    private final static QName _ApexExecutionOverlayResultRequestedById_QNAME = new QName("urn:tooling.soap.sforce.com", "RequestedById");
    private final static QName _ApexExecutionOverlayResultHeapDump_QNAME = new QName("urn:tooling.soap.sforce.com", "HeapDump");
    private final static QName _ApexExecutionOverlayResultSOQLResult_QNAME = new QName("urn:tooling.soap.sforce.com", "SOQLResult");
    private final static QName _ApexExecutionOverlayResultApexResult_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexResult");
    private final static QName _ApexTestResultQueueItemId_QNAME = new QName("urn:tooling.soap.sforce.com", "QueueItemId");
    private final static QName _ApexTestResultQueueItem_QNAME = new QName("urn:tooling.soap.sforce.com", "QueueItem");
    private final static QName _ApexTestResultStackTrace_QNAME = new QName("urn:tooling.soap.sforce.com", "StackTrace");
    private final static QName _ApexTestResultTestTimestamp_QNAME = new QName("urn:tooling.soap.sforce.com", "TestTimestamp");
    private final static QName _ApexTestResultMessage_QNAME = new QName("urn:tooling.soap.sforce.com", "Message");
    private final static QName _ApexTestResultApexLogId_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexLogId");
    private final static QName _ApexTestResultAsyncApexJob_QNAME = new QName("urn:tooling.soap.sforce.com", "AsyncApexJob");
    private final static QName _ApexTestResultAsyncApexJobId_QNAME = new QName("urn:tooling.soap.sforce.com", "AsyncApexJobId");
    private final static QName _ApexTestResultOutcome_QNAME = new QName("urn:tooling.soap.sforce.com", "Outcome");
    private final static QName _ApexTestResultApexLog_QNAME = new QName("urn:tooling.soap.sforce.com", "ApexLog");
    private final static QName _UserDelegatedUsers_QNAME = new QName("urn:tooling.soap.sforce.com", "DelegatedUsers");
    private final static QName _UserUserPreferences_QNAME = new QName("urn:tooling.soap.sforce.com", "UserPreferences");
    private final static QName _UserWorkspaceId_QNAME = new QName("urn:tooling.soap.sforce.com", "WorkspaceId");
    private final static QName _UserManagedUsers_QNAME = new QName("urn:tooling.soap.sforce.com", "ManagedUsers");
    private final static QName _CustomFieldDeveloperName_QNAME = new QName("urn:tooling.soap.sforce.com", "DeveloperName");
    private final static QName _ApexLogApplication_QNAME = new QName("urn:tooling.soap.sforce.com", "Application");
    private final static QName _ApexLogOperation_QNAME = new QName("urn:tooling.soap.sforce.com", "Operation");
    private final static QName _ApexLogDurationMilliseconds_QNAME = new QName("urn:tooling.soap.sforce.com", "DurationMilliseconds");
    private final static QName _ApexLogLogUserId_QNAME = new QName("urn:tooling.soap.sforce.com", "LogUserId");
    private final static QName _ApexLogLogUser_QNAME = new QName("urn:tooling.soap.sforce.com", "LogUser");
    private final static QName _ApexLogLogLength_QNAME = new QName("urn:tooling.soap.sforce.com", "LogLength");
    private final static QName _ApexLogRequest_QNAME = new QName("urn:tooling.soap.sforce.com", "Request");
    private final static QName _ApexLogStartTime_QNAME = new QName("urn:tooling.soap.sforce.com", "StartTime");
    private final static QName _ApexLogLocation_QNAME = new QName("urn:tooling.soap.sforce.com", "Location");
    private final static QName _CustomObjectExternalDataSource_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalDataSource");
    private final static QName _CustomObjectExternalDataSourceId_QNAME = new QName("urn:tooling.soap.sforce.com", "ExternalDataSourceId");
    private final static QName _ApexCodeCoverageAggregateCoverageLastModifiedDate_QNAME = new QName("urn:tooling.soap.sforce.com", "CoverageLastModifiedDate");
    private final static QName _ContainerAsyncRequestState_QNAME = new QName("urn:tooling.soap.sforce.com", "State");
    private final static QName _ContainerAsyncRequestIsCheckOnly_QNAME = new QName("urn:tooling.soap.sforce.com", "IsCheckOnly");
    private final static QName _ContainerAsyncRequestCompilerErrors_QNAME = new QName("urn:tooling.soap.sforce.com", "CompilerErrors");
    private final static QName _ContainerAsyncRequestIsRunTests_QNAME = new QName("urn:tooling.soap.sforce.com", "IsRunTests");
    private final static QName _ContainerAsyncRequestErrorMsg_QNAME = new QName("urn:tooling.soap.sforce.com", "ErrorMsg");
    private final static QName _ContainerAsyncRequestMetadataContainerMemberId_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerMemberId");
    private final static QName _ContainerAsyncRequestMetadataContainerMember_QNAME = new QName("urn:tooling.soap.sforce.com", "MetadataContainerMember");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nttdata.sf.tooling
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertResult }
     * 
     */
    public UpsertResult createUpsertResult() {
        return new UpsertResult();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link DescribeSObjectResponse }
     * 
     */
    public DescribeSObjectResponse createDescribeSObjectResponse() {
        return new DescribeSObjectResponse();
    }

    /**
     * Create an instance of {@link DescribeSObjectResult }
     * 
     */
    public DescribeSObjectResult createDescribeSObjectResult() {
        return new DescribeSObjectResult();
    }

    /**
     * Create an instance of {@link ExecuteAnonymous }
     * 
     */
    public ExecuteAnonymous createExecuteAnonymous() {
        return new ExecuteAnonymous();
    }

    /**
     * Create an instance of {@link GetUpdatedResponse }
     * 
     */
    public GetUpdatedResponse createGetUpdatedResponse() {
        return new GetUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResult }
     * 
     */
    public GetUpdatedResult createGetUpdatedResult() {
        return new GetUpdatedResult();
    }

    /**
     * Create an instance of {@link QueryAllResponse }
     * 
     */
    public QueryAllResponse createQueryAllResponse() {
        return new QueryAllResponse();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link QueryMore }
     * 
     */
    public QueryMore createQueryMore() {
        return new QueryMore();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SaveResult }
     * 
     */
    public SaveResult createSaveResult() {
        return new SaveResult();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link PackageVersionHeader }
     * 
     */
    public PackageVersionHeader createPackageVersionHeader() {
        return new PackageVersionHeader();
    }

    /**
     * Create an instance of {@link PackageVersion }
     * 
     */
    public PackageVersion createPackageVersion() {
        return new PackageVersion();
    }

    /**
     * Create an instance of {@link DescribeGlobalResponse }
     * 
     */
    public DescribeGlobalResponse createDescribeGlobalResponse() {
        return new DescribeGlobalResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalResult }
     * 
     */
    public DescribeGlobalResult createDescribeGlobalResult() {
        return new DescribeGlobalResult();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link LogInfo }
     * 
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link RunTestsResponse }
     * 
     */
    public RunTestsResponse createRunTestsResponse() {
        return new RunTestsResponse();
    }

    /**
     * Create an instance of {@link RunTestsResult }
     * 
     */
    public RunTestsResult createRunTestsResult() {
        return new RunTestsResult();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link QueryMoreResponse }
     * 
     */
    public QueryMoreResponse createQueryMoreResponse() {
        return new QueryMoreResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link GetDeleted }
     * 
     */
    public GetDeleted createGetDeleted() {
        return new GetDeleted();
    }

    /**
     * Create an instance of {@link ApiQueryFault }
     * 
     */
    public ApiQueryFault createApiQueryFault() {
        return new ApiQueryFault();
    }

    /**
     * Create an instance of {@link ExecuteAnonymousResponse }
     * 
     */
    public ExecuteAnonymousResponse createExecuteAnonymousResponse() {
        return new ExecuteAnonymousResponse();
    }

    /**
     * Create an instance of {@link ExecuteAnonymousResult }
     * 
     */
    public ExecuteAnonymousResult createExecuteAnonymousResult() {
        return new ExecuteAnonymousResult();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActions }
     * 
     */
    public DescribeWorkitemActions createDescribeWorkitemActions() {
        return new DescribeWorkitemActions();
    }

    /**
     * Create an instance of {@link RunTestsAsynchronous }
     * 
     */
    public RunTestsAsynchronous createRunTestsAsynchronous() {
        return new RunTestsAsynchronous();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link DisableFeedTrackingHeader }
     * 
     */
    public DisableFeedTrackingHeader createDisableFeedTrackingHeader() {
        return new DisableFeedTrackingHeader();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link GetServerTimestampResponse }
     * 
     */
    public GetServerTimestampResponse createGetServerTimestampResponse() {
        return new GetServerTimestampResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestampResult }
     * 
     */
    public GetServerTimestampResult createGetServerTimestampResult() {
        return new GetServerTimestampResult();
    }

    /**
     * Create an instance of {@link AllOrNoneHeader }
     * 
     */
    public AllOrNoneHeader createAllOrNoneHeader() {
        return new AllOrNoneHeader();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResponse }
     * 
     */
    public InvalidateSessionsResponse createInvalidateSessionsResponse() {
        return new InvalidateSessionsResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResult }
     * 
     */
    public InvalidateSessionsResult createInvalidateSessionsResult() {
        return new InvalidateSessionsResult();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link QueryAll }
     * 
     */
    public QueryAll createQueryAll() {
        return new QueryAll();
    }

    /**
     * Create an instance of {@link GetUpdated }
     * 
     */
    public GetUpdated createGetUpdated() {
        return new GetUpdated();
    }

    /**
     * Create an instance of {@link DescribeSObjects }
     * 
     */
    public DescribeSObjects createDescribeSObjects() {
        return new DescribeSObjects();
    }

    /**
     * Create an instance of {@link DescribeSObject }
     * 
     */
    public DescribeSObject createDescribeSObject() {
        return new DescribeSObject();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionsResponse }
     * 
     */
    public DescribeWorkitemActionsResponse createDescribeWorkitemActionsResponse() {
        return new DescribeWorkitemActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeWorkitemActionResult }
     * 
     */
    public DescribeWorkitemActionResult createDescribeWorkitemActionResult() {
        return new DescribeWorkitemActionResult();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestamp }
     * 
     */
    public GetServerTimestamp createGetServerTimestamp() {
        return new GetServerTimestamp();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link InvalidateSessions }
     * 
     */
    public InvalidateSessions createInvalidateSessions() {
        return new InvalidateSessions();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link RunTestsAsynchronousResponse }
     * 
     */
    public RunTestsAsynchronousResponse createRunTestsAsynchronousResponse() {
        return new RunTestsAsynchronousResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResult }
     * 
     */
    public SetPasswordResult createSetPasswordResult() {
        return new SetPasswordResult();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link GetDeletedResult }
     * 
     */
    public GetDeletedResult createGetDeletedResult() {
        return new GetDeletedResult();
    }

    /**
     * Create an instance of {@link DescribeGlobal }
     * 
     */
    public DescribeGlobal createDescribeGlobal() {
        return new DescribeGlobal();
    }

    /**
     * Create an instance of {@link RunTests }
     * 
     */
    public RunTests createRunTests() {
        return new RunTests();
    }

    /**
     * Create an instance of {@link RunTestsRequest }
     * 
     */
    public RunTestsRequest createRunTestsRequest() {
        return new RunTestsRequest();
    }

    /**
     * Create an instance of {@link DescribeSObjectsResponse }
     * 
     */
    public DescribeSObjectsResponse createDescribeSObjectsResponse() {
        return new DescribeSObjectsResponse();
    }

    /**
     * Create an instance of {@link WorkflowRule }
     * 
     */
    public WorkflowRule createWorkflowRule() {
        return new WorkflowRule();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DescribeColorResult }
     * 
     */
    public DescribeColorResult createDescribeColorResult() {
        return new DescribeColorResult();
    }

    /**
     * Create an instance of {@link WorkflowFlowAction }
     * 
     */
    public WorkflowFlowAction createWorkflowFlowAction() {
        return new WorkflowFlowAction();
    }

    /**
     * Create an instance of {@link MetadataContainerMember }
     * 
     */
    public MetadataContainerMember createMetadataContainerMember() {
        return new MetadataContainerMember();
    }

    /**
     * Create an instance of {@link CodeCoverageWarning }
     * 
     */
    public CodeCoverageWarning createCodeCoverageWarning() {
        return new CodeCoverageWarning();
    }

    /**
     * Create an instance of {@link TraceFlag }
     * 
     */
    public TraceFlag createTraceFlag() {
        return new TraceFlag();
    }

    /**
     * Create an instance of {@link IDEPerspective }
     * 
     */
    public IDEPerspective createIDEPerspective() {
        return new IDEPerspective();
    }

    /**
     * Create an instance of {@link EscalationRules }
     * 
     */
    public EscalationRules createEscalationRules() {
        return new EscalationRules();
    }

    /**
     * Create an instance of {@link AttributeDefinition }
     * 
     */
    public AttributeDefinition createAttributeDefinition() {
        return new AttributeDefinition();
    }

    /**
     * Create an instance of {@link BooleanValue }
     * 
     */
    public BooleanValue createBooleanValue() {
        return new BooleanValue();
    }

    /**
     * Create an instance of {@link WorkflowEmailRecipient }
     * 
     */
    public WorkflowEmailRecipient createWorkflowEmailRecipient() {
        return new WorkflowEmailRecipient();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link HeapDump }
     * 
     */
    public HeapDump createHeapDump() {
        return new HeapDump();
    }

    /**
     * Create an instance of {@link FilterItem }
     * 
     */
    public FilterItem createFilterItem() {
        return new FilterItem();
    }

    /**
     * Create an instance of {@link QueryResultMetadata }
     * 
     */
    public QueryResultMetadata createQueryResultMetadata() {
        return new QueryResultMetadata();
    }

    /**
     * Create an instance of {@link WorkflowFlowActionParameter }
     * 
     */
    public WorkflowFlowActionParameter createWorkflowFlowActionParameter() {
        return new WorkflowFlowActionParameter();
    }

    /**
     * Create an instance of {@link WorkflowTaskMetadata }
     * 
     */
    public WorkflowTaskMetadata createWorkflowTaskMetadata() {
        return new WorkflowTaskMetadata();
    }

    /**
     * Create an instance of {@link StateValue }
     * 
     */
    public StateValue createStateValue() {
        return new StateValue();
    }

    /**
     * Create an instance of {@link ApexExecutionOverlayAction }
     * 
     */
    public ApexExecutionOverlayAction createApexExecutionOverlayAction() {
        return new ApexExecutionOverlayAction();
    }

    /**
     * Create an instance of {@link NumberValue }
     * 
     */
    public NumberValue createNumberValue() {
        return new NumberValue();
    }

    /**
     * Create an instance of {@link ApexOrgWideCoverage }
     * 
     */
    public ApexOrgWideCoverage createApexOrgWideCoverage() {
        return new ApexOrgWideCoverage();
    }

    /**
     * Create an instance of {@link ChildRelationship }
     * 
     */
    public ChildRelationship createChildRelationship() {
        return new ChildRelationship();
    }

    /**
     * Create an instance of {@link DescribeLayoutComponent }
     * 
     */
    public DescribeLayoutComponent createDescribeLayoutComponent() {
        return new DescribeLayoutComponent();
    }

    /**
     * Create an instance of {@link WsdlToApexInfo }
     * 
     */
    public WsdlToApexInfo createWsdlToApexInfo() {
        return new WsdlToApexInfo();
    }

    /**
     * Create an instance of {@link ApexLog }
     * 
     */
    public ApexLog createApexLog() {
        return new ApexLog();
    }

    /**
     * Create an instance of {@link LookupFilter }
     * 
     */
    public LookupFilter createLookupFilter() {
        return new LookupFilter();
    }

    /**
     * Create an instance of {@link MalformedQueryFault }
     * 
     */
    public MalformedQueryFault createMalformedQueryFault() {
        return new MalformedQueryFault();
    }

    /**
     * Create an instance of {@link CodeCoverageResult }
     * 
     */
    public CodeCoverageResult createCodeCoverageResult() {
        return new CodeCoverageResult();
    }

    /**
     * Create an instance of {@link DescribeLayoutButton }
     * 
     */
    public DescribeLayoutButton createDescribeLayoutButton() {
        return new DescribeLayoutButton();
    }

    /**
     * Create an instance of {@link ApexComponent }
     * 
     */
    public ApexComponent createApexComponent() {
        return new ApexComponent();
    }

    /**
     * Create an instance of {@link DescribeLayoutItem }
     * 
     */
    public DescribeLayoutItem createDescribeLayoutItem() {
        return new DescribeLayoutItem();
    }

    /**
     * Create an instance of {@link WorkflowKnowledgePublish }
     * 
     */
    public WorkflowKnowledgePublish createWorkflowKnowledgePublish() {
        return new WorkflowKnowledgePublish();
    }

    /**
     * Create an instance of {@link InvalidQueryLocatorFault }
     * 
     */
    public InvalidQueryLocatorFault createInvalidQueryLocatorFault() {
        return new InvalidQueryLocatorFault();
    }

    /**
     * Create an instance of {@link CompileAndTestResult }
     * 
     */
    public CompileAndTestResult createCompileAndTestResult() {
        return new CompileAndTestResult();
    }

    /**
     * Create an instance of {@link Workflow }
     * 
     */
    public Workflow createWorkflow() {
        return new Workflow();
    }

    /**
     * Create an instance of {@link ExternalMethod }
     * 
     */
    public ExternalMethod createExternalMethod() {
        return new ExternalMethod();
    }

    /**
     * Create an instance of {@link SOQLResult }
     * 
     */
    public SOQLResult createSOQLResult() {
        return new SOQLResult();
    }

    /**
     * Create an instance of {@link ApexClassMetadata }
     * 
     */
    public ApexClassMetadata createApexClassMetadata() {
        return new ApexClassMetadata();
    }

    /**
     * Create an instance of {@link WorkflowActionReference }
     * 
     */
    public WorkflowActionReference createWorkflowActionReference() {
        return new WorkflowActionReference();
    }

    /**
     * Create an instance of {@link DescribeLayoutButtonSection }
     * 
     */
    public DescribeLayoutButtonSection createDescribeLayoutButtonSection() {
        return new DescribeLayoutButtonSection();
    }

    /**
     * Create an instance of {@link WorkflowTimeTrigger }
     * 
     */
    public WorkflowTimeTrigger createWorkflowTimeTrigger() {
        return new WorkflowTimeTrigger();
    }

    /**
     * Create an instance of {@link WorkflowOutboundMessageMetadata }
     * 
     */
    public WorkflowOutboundMessageMetadata createWorkflowOutboundMessageMetadata() {
        return new WorkflowOutboundMessageMetadata();
    }

    /**
     * Create an instance of {@link ApexComponentMember }
     * 
     */
    public ApexComponentMember createApexComponentMember() {
        return new ApexComponentMember();
    }

    /**
     * Create an instance of {@link IDEWorkspace }
     * 
     */
    public IDEWorkspace createIDEWorkspace() {
        return new IDEWorkspace();
    }

    /**
     * Create an instance of {@link WorkflowOutboundMessage }
     * 
     */
    public WorkflowOutboundMessage createWorkflowOutboundMessage() {
        return new WorkflowOutboundMessage();
    }

    /**
     * Create an instance of {@link RunTestSuccess }
     * 
     */
    public RunTestSuccess createRunTestSuccess() {
        return new RunTestSuccess();
    }

    /**
     * Create an instance of {@link ContainerAsyncRequest }
     * 
     */
    public ContainerAsyncRequest createContainerAsyncRequest() {
        return new ContainerAsyncRequest();
    }

    /**
     * Create an instance of {@link PackageVersionMetadata }
     * 
     */
    public PackageVersionMetadata createPackageVersionMetadata() {
        return new PackageVersionMetadata();
    }

    /**
     * Create an instance of {@link ValidationRuleMetadata }
     * 
     */
    public ValidationRuleMetadata createValidationRuleMetadata() {
        return new ValidationRuleMetadata();
    }

    /**
     * Create an instance of {@link AggregateQueryResultColumnMetadata }
     * 
     */
    public AggregateQueryResultColumnMetadata createAggregateQueryResultColumnMetadata() {
        return new AggregateQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link WorkflowTask }
     * 
     */
    public WorkflowTask createWorkflowTask() {
        return new WorkflowTask();
    }

    /**
     * Create an instance of {@link EscalationAction }
     * 
     */
    public EscalationAction createEscalationAction() {
        return new EscalationAction();
    }

    /**
     * Create an instance of {@link InvalidNewPasswordFault }
     * 
     */
    public InvalidNewPasswordFault createInvalidNewPasswordFault() {
        return new InvalidNewPasswordFault();
    }

    /**
     * Create an instance of {@link DescribeLayoutSection }
     * 
     */
    public DescribeLayoutSection createDescribeLayoutSection() {
        return new DescribeLayoutSection();
    }

    /**
     * Create an instance of {@link ApexTriggerMetadata }
     * 
     */
    public ApexTriggerMetadata createApexTriggerMetadata() {
        return new ApexTriggerMetadata();
    }

    /**
     * Create an instance of {@link MalformedSearchFault }
     * 
     */
    public MalformedSearchFault createMalformedSearchFault() {
        return new MalformedSearchFault();
    }

    /**
     * Create an instance of {@link AssignmentRule }
     * 
     */
    public AssignmentRule createAssignmentRule() {
        return new AssignmentRule();
    }

    /**
     * Create an instance of {@link AutoResponseRule }
     * 
     */
    public AutoResponseRule createAutoResponseRule() {
        return new AutoResponseRule();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link InvalidIdFault }
     * 
     */
    public InvalidIdFault createInvalidIdFault() {
        return new InvalidIdFault();
    }

    /**
     * Create an instance of {@link ApexResult }
     * 
     */
    public ApexResult createApexResult() {
        return new ApexResult();
    }

    /**
     * Create an instance of {@link PicklistEntry }
     * 
     */
    public PicklistEntry createPicklistEntry() {
        return new PicklistEntry();
    }

    /**
     * Create an instance of {@link WorkflowAlertMetadata }
     * 
     */
    public WorkflowAlertMetadata createWorkflowAlertMetadata() {
        return new WorkflowAlertMetadata();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link UserPreference }
     * 
     */
    public UserPreference createUserPreference() {
        return new UserPreference();
    }

    /**
     * Create an instance of {@link WorkflowFieldUpdateMetadata }
     * 
     */
    public WorkflowFieldUpdateMetadata createWorkflowFieldUpdateMetadata() {
        return new WorkflowFieldUpdateMetadata();
    }

    /**
     * Create an instance of {@link DescribeIconResult }
     * 
     */
    public DescribeIconResult createDescribeIconResult() {
        return new DescribeIconResult();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link SymbolTable }
     * 
     */
    public SymbolTable createSymbolTable() {
        return new SymbolTable();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Method }
     * 
     */
    public Method createMethod() {
        return new Method();
    }

    /**
     * Create an instance of {@link MapEntry }
     * 
     */
    public MapEntry createMapEntry() {
        return new MapEntry();
    }

    /**
     * Create an instance of {@link RunTestFailure }
     * 
     */
    public RunTestFailure createRunTestFailure() {
        return new RunTestFailure();
    }

    /**
     * Create an instance of {@link CompileClassResult }
     * 
     */
    public CompileClassResult createCompileClassResult() {
        return new CompileClassResult();
    }

    /**
     * Create an instance of {@link SetValue }
     * 
     */
    public SetValue createSetValue() {
        return new SetValue();
    }

    /**
     * Create an instance of {@link ProcessResult }
     * 
     */
    public ProcessResult createProcessResult() {
        return new ProcessResult();
    }

    /**
     * Create an instance of {@link ListValue }
     * 
     */
    public ListValue createListValue() {
        return new ListValue();
    }

    /**
     * Create an instance of {@link WorkflowAlert }
     * 
     */
    public WorkflowAlert createWorkflowAlert() {
        return new WorkflowAlert();
    }

    /**
     * Create an instance of {@link Coverage }
     * 
     */
    public Coverage createCoverage() {
        return new Coverage();
    }

    /**
     * Create an instance of {@link Picklist }
     * 
     */
    public Picklist createPicklist() {
        return new Picklist();
    }

    /**
     * Create an instance of {@link ExternalConstructor }
     * 
     */
    public ExternalConstructor createExternalConstructor() {
        return new ExternalConstructor();
    }

    /**
     * Create an instance of {@link ApexClassMember }
     * 
     */
    public ApexClassMember createApexClassMember() {
        return new ApexClassMember();
    }

    /**
     * Create an instance of {@link ResetPasswordResult }
     * 
     */
    public ResetPasswordResult createResetPasswordResult() {
        return new ResetPasswordResult();
    }

    /**
     * Create an instance of {@link ApexPageMember }
     * 
     */
    public ApexPageMember createApexPageMember() {
        return new ApexPageMember();
    }

    /**
     * Create an instance of {@link ValidationRule }
     * 
     */
    public ValidationRule createValidationRule() {
        return new ValidationRule();
    }

    /**
     * Create an instance of {@link QueryResultColumnMetadata }
     * 
     */
    public QueryResultColumnMetadata createQueryResultColumnMetadata() {
        return new QueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link RecordTypeInfo }
     * 
     */
    public RecordTypeInfo createRecordTypeInfo() {
        return new RecordTypeInfo();
    }

    /**
     * Create an instance of {@link DescribeColumn }
     * 
     */
    public DescribeColumn createDescribeColumn() {
        return new DescribeColumn();
    }

    /**
     * Create an instance of {@link ApexPage }
     * 
     */
    public ApexPage createApexPage() {
        return new ApexPage();
    }

    /**
     * Create an instance of {@link RecordTypePicklist }
     * 
     */
    public RecordTypePicklist createRecordTypePicklist() {
        return new RecordTypePicklist();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link AssignmentRules }
     * 
     */
    public AssignmentRules createAssignmentRules() {
        return new AssignmentRules();
    }

    /**
     * Create an instance of {@link NamespacePackagePair }
     * 
     */
    public NamespacePackagePair createNamespacePackagePair() {
        return new NamespacePackagePair();
    }

    /**
     * Create an instance of {@link PrimitiveQueryResultColumnMetadata }
     * 
     */
    public PrimitiveQueryResultColumnMetadata createPrimitiveQueryResultColumnMetadata() {
        return new PrimitiveQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link EscalationRule }
     * 
     */
    public EscalationRule createEscalationRule() {
        return new EscalationRule();
    }

    /**
     * Create an instance of {@link AggregateExpressionResultColumnMetadata }
     * 
     */
    public AggregateExpressionResultColumnMetadata createAggregateExpressionResultColumnMetadata() {
        return new AggregateExpressionResultColumnMetadata();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link HeapAddress }
     * 
     */
    public HeapAddress createHeapAddress() {
        return new HeapAddress();
    }

    /**
     * Create an instance of {@link WsdlToApexResult }
     * 
     */
    public WsdlToApexResult createWsdlToApexResult() {
        return new WsdlToApexResult();
    }

    /**
     * Create an instance of {@link CompileTriggerResult }
     * 
     */
    public CompileTriggerResult createCompileTriggerResult() {
        return new CompileTriggerResult();
    }

    /**
     * Create an instance of {@link WorkflowAction }
     * 
     */
    public WorkflowAction createWorkflowAction() {
        return new WorkflowAction();
    }

    /**
     * Create an instance of {@link ApexCodeCoverageAggregate }
     * 
     */
    public ApexCodeCoverageAggregate createApexCodeCoverageAggregate() {
        return new ApexCodeCoverageAggregate();
    }

    /**
     * Create an instance of {@link ApexTestQueueItem }
     * 
     */
    public ApexTestQueueItem createApexTestQueueItem() {
        return new ApexTestQueueItem();
    }

    /**
     * Create an instance of {@link ApexTestResult }
     * 
     */
    public ApexTestResult createApexTestResult() {
        return new ApexTestResult();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValue() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link ExternalSymbol }
     * 
     */
    public ExternalSymbol createExternalSymbol() {
        return new ExternalSymbol();
    }

    /**
     * Create an instance of {@link AsyncApexJob }
     * 
     */
    public AsyncApexJob createAsyncApexJob() {
        return new AsyncApexJob();
    }

    /**
     * Create an instance of {@link CustomObject }
     * 
     */
    public CustomObject createCustomObject() {
        return new CustomObject();
    }

    /**
     * Create an instance of {@link ApexTrigger }
     * 
     */
    public ApexTrigger createApexTrigger() {
        return new ApexTrigger();
    }

    /**
     * Create an instance of {@link Constructor }
     * 
     */
    public Constructor createConstructor() {
        return new Constructor();
    }

    /**
     * Create an instance of {@link WorkflowSend }
     * 
     */
    public WorkflowSend createWorkflowSend() {
        return new WorkflowSend();
    }

    /**
     * Create an instance of {@link TypeExtent }
     * 
     */
    public TypeExtent createTypeExtent() {
        return new TypeExtent();
    }

    /**
     * Create an instance of {@link AllowedWorkitemAction }
     * 
     */
    public AllowedWorkitemAction createAllowedWorkitemAction() {
        return new AllowedWorkitemAction();
    }

    /**
     * Create an instance of {@link RuleEntry }
     * 
     */
    public RuleEntry createRuleEntry() {
        return new RuleEntry();
    }

    /**
     * Create an instance of {@link ApexComponentMetadata }
     * 
     */
    public ApexComponentMetadata createApexComponentMetadata() {
        return new ApexComponentMetadata();
    }

    /**
     * Create an instance of {@link WorkflowFieldUpdate }
     * 
     */
    public WorkflowFieldUpdate createWorkflowFieldUpdate() {
        return new WorkflowFieldUpdate();
    }

    /**
     * Create an instance of {@link DeletedRecord }
     * 
     */
    public DeletedRecord createDeletedRecord() {
        return new DeletedRecord();
    }

    /**
     * Create an instance of {@link CompileAndTestRequest }
     * 
     */
    public CompileAndTestRequest createCompileAndTestRequest() {
        return new CompileAndTestRequest();
    }

    /**
     * Create an instance of {@link ApexCodeCoverage }
     * 
     */
    public ApexCodeCoverage createApexCodeCoverage() {
        return new ApexCodeCoverage();
    }

    /**
     * Create an instance of {@link ComplexQueryResultColumnMetadata }
     * 
     */
    public ComplexQueryResultColumnMetadata createComplexQueryResultColumnMetadata() {
        return new ComplexQueryResultColumnMetadata();
    }

    /**
     * Create an instance of {@link ApexPageMetadata }
     * 
     */
    public ApexPageMetadata createApexPageMetadata() {
        return new ApexPageMetadata();
    }

    /**
     * Create an instance of {@link WorkflowRuleMetadata }
     * 
     */
    public WorkflowRuleMetadata createWorkflowRuleMetadata() {
        return new WorkflowRuleMetadata();
    }

    /**
     * Create an instance of {@link DeleteApexResult }
     * 
     */
    public DeleteApexResult createDeleteApexResult() {
        return new DeleteApexResult();
    }

    /**
     * Create an instance of {@link StaticResource }
     * 
     */
    public StaticResource createStaticResource() {
        return new StaticResource();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link VisibilitySymbol }
     * 
     */
    public VisibilitySymbol createVisibilitySymbol() {
        return new VisibilitySymbol();
    }

    /**
     * Create an instance of {@link CodeLocation }
     * 
     */
    public CodeLocation createCodeLocation() {
        return new CodeLocation();
    }

    /**
     * Create an instance of {@link InvalidSObjectFault }
     * 
     */
    public InvalidSObjectFault createInvalidSObjectFault() {
        return new InvalidSObjectFault();
    }

    /**
     * Create an instance of {@link DescribeGlobalSObjectResult }
     * 
     */
    public DescribeGlobalSObjectResult createDescribeGlobalSObjectResult() {
        return new DescribeGlobalSObjectResult();
    }

    /**
     * Create an instance of {@link InvalidFieldFault }
     * 
     */
    public InvalidFieldFault createInvalidFieldFault() {
        return new InvalidFieldFault();
    }

    /**
     * Create an instance of {@link MapValue }
     * 
     */
    public MapValue createMapValue() {
        return new MapValue();
    }

    /**
     * Create an instance of {@link ApexClass }
     * 
     */
    public ApexClass createApexClass() {
        return new ApexClass();
    }

    /**
     * Create an instance of {@link ApexExecutionOverlayResult }
     * 
     */
    public ApexExecutionOverlayResult createApexExecutionOverlayResult() {
        return new ApexExecutionOverlayResult();
    }

    /**
     * Create an instance of {@link CustomFieldMetadata }
     * 
     */
    public CustomFieldMetadata createCustomFieldMetadata() {
        return new CustomFieldMetadata();
    }

    /**
     * Create an instance of {@link AutoResponseRules }
     * 
     */
    public AutoResponseRules createAutoResponseRules() {
        return new AutoResponseRules();
    }

    /**
     * Create an instance of {@link MetadataContainer }
     * 
     */
    public MetadataContainer createMetadataContainer() {
        return new MetadataContainer();
    }

    /**
     * Create an instance of {@link DescribeLayoutRow }
     * 
     */
    public DescribeLayoutRow createDescribeLayoutRow() {
        return new DescribeLayoutRow();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ExternalReference }
     * 
     */
    public ExternalReference createExternalReference() {
        return new ExternalReference();
    }

    /**
     * Create an instance of {@link ApexTriggerMember }
     * 
     */
    public ApexTriggerMember createApexTriggerMember() {
        return new ApexTriggerMember();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidFieldFault")
    public JAXBElement<Object> createInvalidFieldFault(Object value) {
        return new JAXBElement<Object>(_InvalidFieldFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MalformedSearchFault")
    public JAXBElement<Object> createMalformedSearchFault(Object value) {
        return new JAXBElement<Object>(_MalformedSearchFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MalformedQueryFault")
    public JAXBElement<Object> createMalformedQueryFault(Object value) {
        return new JAXBElement<Object>(_MalformedQueryFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidIdFault")
    public JAXBElement<Object> createInvalidIdFault(Object value) {
        return new JAXBElement<Object>(_InvalidIdFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidSObjectFault")
    public JAXBElement<Object> createInvalidSObjectFault(Object value) {
        return new JAXBElement<Object>(_InvalidSObjectFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiFault")
    public JAXBElement<ApiFault> createApiFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_ApiFault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidNewPasswordFault")
    public JAXBElement<Object> createInvalidNewPasswordFault(Object value) {
        return new JAXBElement<Object>(_InvalidNewPasswordFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "InvalidQueryLocatorFault")
    public JAXBElement<Object> createInvalidQueryLocatorFault(Object value) {
        return new JAXBElement<Object>(_InvalidQueryLocatorFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LoginFault")
    public JAXBElement<Object> createLoginFault(Object value) {
        return new JAXBElement<Object>(_LoginFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiQueryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiQueryFault")
    public JAXBElement<ApiQueryFault> createApiQueryFault(ApiQueryFault value) {
        return new JAXBElement<ApiQueryFault>(_ApiQueryFault_QNAME, ApiQueryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UnexpectedErrorFault")
    public JAXBElement<Object> createUnexpectedErrorFault(Object value) {
        return new JAXBElement<Object>(_UnexpectedErrorFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SourceTableEnumOrId", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateSourceTableEnumOrId(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateSourceTableEnumOrId_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowFieldUpdate.class)
    public JAXBElement<String> createWorkflowFieldUpdateNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowFieldUpdate.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowFieldUpdateLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowFieldUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleFullName(String value) {
        return new JAXBElement<String>(_ValidationRuleFullName_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ValidationName", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleValidationName(String value) {
        return new JAXBElement<String>(_ValidationRuleValidationName_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ValidationRule.class)
    public JAXBElement<String> createValidationRuleNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationRuleMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ValidationRule.class)
    public JAXBElement<ValidationRuleMetadata> createValidationRuleMetadata(ValidationRuleMetadata value) {
        return new JAXBElement<ValidationRuleMetadata>(_ValidationRuleMetadata_QNAME, ValidationRuleMetadata.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ValidationRule.class)
    public JAXBElement<XMLGregorianCalendar> createValidationRuleLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ValidationRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexPageMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexPageMember.class)
    public JAXBElement<ApexPageMetadata> createApexPageMemberMetadata(ApexPageMetadata value) {
        return new JAXBElement<ApexPageMetadata>(_ValidationRuleMetadata_QNAME, ApexPageMetadata.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexPageMember.class)
    public JAXBElement<ApexPage> createApexPageMemberContentEntity(ApexPage value) {
        return new JAXBElement<ApexPage>(_ApexPageMemberContentEntity_QNAME, ApexPage.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexPageMember.class)
    public JAXBElement<User> createApexPageMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexPageMember.class)
    public JAXBElement<Boolean> createApexPageMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexPageMember.class)
    public JAXBElement<String> createApexPageMemberContentEntityId(String value) {
        return new JAXBElement<String>(_ApexPageMemberContentEntityId_QNAME, String.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexPageMember.class)
    public JAXBElement<User> createApexPageMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexPageMember.class)
    public JAXBElement<MetadataContainer> createApexPageMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexPageMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexPageMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExecutableEntity", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Name> createApexExecutionOverlayActionExecutableEntity(Name value) {
        return new JAXBElement<Name>(_ApexExecutionOverlayActionExecutableEntity_QNAME, Name.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Scope", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionScope(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayActionScope_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Line", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Integer> createApexExecutionOverlayActionLine(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayActionLine_QNAME, Integer.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Boolean> createApexExecutionOverlayActionIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScript", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionActionScript(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionActionScript_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Iteration", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Integer> createApexExecutionOverlayActionIteration(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayActionIteration_QNAME, Integer.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayActionExpirationDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ScopeId", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionScopeId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionScopeId_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExecutableEntityId", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionExecutableEntityId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionExecutableEntityId_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDumpingHeap", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<Boolean> createApexExecutionOverlayActionIsDumpingHeap(Boolean value) {
        return new JAXBElement<Boolean>(_ApexExecutionOverlayActionIsDumpingHeap_QNAME, Boolean.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<User> createApexExecutionOverlayActionLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayActionLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScriptType", scope = ApexExecutionOverlayAction.class)
    public JAXBElement<String> createApexExecutionOverlayActionActionScriptType(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionActionScriptType_QNAME, String.class, ApexExecutionOverlayAction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexComponentMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexComponentMember.class)
    public JAXBElement<ApexComponentMetadata> createApexComponentMemberMetadata(ApexComponentMetadata value) {
        return new JAXBElement<ApexComponentMetadata>(_ValidationRuleMetadata_QNAME, ApexComponentMetadata.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexComponentMember.class)
    public JAXBElement<ApexComponent> createApexComponentMemberContentEntity(ApexComponent value) {
        return new JAXBElement<ApexComponent>(_ApexPageMemberContentEntity_QNAME, ApexComponent.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexComponentMember.class)
    public JAXBElement<User> createApexComponentMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexComponentMember.class)
    public JAXBElement<Boolean> createApexComponentMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexComponentMember.class)
    public JAXBElement<String> createApexComponentMemberContentEntityId(String value) {
        return new JAXBElement<String>(_ApexPageMemberContentEntityId_QNAME, String.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexComponentMember.class)
    public JAXBElement<User> createApexComponentMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexComponentMember.class)
    public JAXBElement<MetadataContainer> createApexComponentMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexComponentMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexComponentMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceUser(User value) {
        return new JAXBElement<User>(_IDEWorkspaceUser_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = IDEWorkspace.class)
    public JAXBElement<String> createIDEWorkspaceUserId(String value) {
        return new JAXBElement<String>(_IDEWorkspaceUserId_QNAME, String.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = IDEWorkspace.class)
    public JAXBElement<User> createIDEWorkspaceCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = IDEWorkspace.class)
    public JAXBElement<XMLGregorianCalendar> createIDEWorkspaceLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = IDEWorkspace.class)
    public JAXBElement<Boolean> createIDEWorkspaceIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, IDEWorkspace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = MetadataContainer.class)
    public JAXBElement<String> createMetadataContainerName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = MetadataContainer.class)
    public JAXBElement<User> createMetadataContainerLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = MetadataContainer.class)
    public JAXBElement<User> createMetadataContainerCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = MetadataContainer.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = MetadataContainer.class)
    public JAXBElement<Boolean> createMetadataContainerIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, MetadataContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleFullName(String value) {
        return new JAXBElement<String>(_ValidationRuleFullName_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowRule.class)
    public JAXBElement<String> createWorkflowRuleNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkflowRuleMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = WorkflowRule.class)
    public JAXBElement<WorkflowRuleMetadata> createWorkflowRuleMetadata(WorkflowRuleMetadata value) {
        return new JAXBElement<WorkflowRuleMetadata>(_ValidationRuleMetadata_QNAME, WorkflowRuleMetadata.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowRule.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowRuleLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexPage.class)
    public JAXBElement<String> createApexPageCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerType", scope = ApexPage.class)
    public JAXBElement<String> createApexPageControllerType(String value) {
        return new JAXBElement<String>(_ApexPageControllerType_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexPage.class)
    public JAXBElement<String> createApexPageName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexPage.class)
    public JAXBElement<String> createApexPageNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsConfirmationTokenRequired", scope = ApexPage.class)
    public JAXBElement<Boolean> createApexPageIsConfirmationTokenRequired(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageIsConfirmationTokenRequired_QNAME, Boolean.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexPage.class)
    public JAXBElement<User> createApexPageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerKey", scope = ApexPage.class)
    public JAXBElement<String> createApexPageControllerKey(String value) {
        return new JAXBElement<String>(_ApexPageControllerKey_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsAvailableInTouch", scope = ApexPage.class)
    public JAXBElement<Boolean> createApexPageIsAvailableInTouch(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageIsAvailableInTouch_QNAME, Boolean.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexPage.class)
    public JAXBElement<String> createApexPageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = ApexPage.class)
    public JAXBElement<String> createApexPageDescription(String value) {
        return new JAXBElement<String>(_ApexPageDescription_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexPage.class)
    public JAXBElement<Double> createApexPageApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexPageApiVersion_QNAME, Double.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexPage.class)
    public JAXBElement<User> createApexPageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = ApexPage.class)
    public JAXBElement<String> createApexPageMasterLabel(String value) {
        return new JAXBElement<String>(_ApexPageMasterLabel_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Markup", scope = ApexPage.class)
    public JAXBElement<String> createApexPageMarkup(String value) {
        return new JAXBElement<String>(_ApexPageMarkup_QNAME, String.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexPage.class)
    public JAXBElement<XMLGregorianCalendar> createApexPageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexPage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowOutboundMessage.class)
    public JAXBElement<String> createWorkflowOutboundMessageNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowOutboundMessage.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowOutboundMessageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowOutboundMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = UserPreference.class)
    public JAXBElement<XMLGregorianCalendar> createUserPreferenceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Value", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferenceValue(String value) {
        return new JAXBElement<String>(_UserPreferenceValue_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferenceUserId(String value) {
        return new JAXBElement<String>(_IDEWorkspaceUserId_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Preference", scope = UserPreference.class)
    public JAXBElement<String> createUserPreferencePreference(String value) {
        return new JAXBElement<String>(_UserPreferencePreference_QNAME, String.class, UserPreference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = MetadataContainerMember.class)
    public JAXBElement<String> createMetadataContainerMemberContentEntityId(String value) {
        return new JAXBElement<String>(_ApexPageMemberContentEntityId_QNAME, String.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = MetadataContainerMember.class)
    public JAXBElement<Name> createMetadataContainerMemberContentEntity(Name value) {
        return new JAXBElement<Name>(_ApexPageMemberContentEntity_QNAME, Name.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = MetadataContainerMember.class)
    public JAXBElement<MetadataContainer> createMetadataContainerMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = MetadataContainerMember.class)
    public JAXBElement<XMLGregorianCalendar> createMetadataContainerMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, MetadataContainerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsValid", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerIsValid_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterInsert", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterInsert(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterInsert_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LengthWithoutComments", scope = ApexTrigger.class)
    public JAXBElement<Integer> createApexTriggerLengthWithoutComments(Integer value) {
        return new JAXBElement<Integer>(_ApexTriggerLengthWithoutComments_QNAME, Integer.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeInsert", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeInsert(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeInsert_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageIsBulk", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageIsBulk(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageIsBulk_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyCrc", scope = ApexTrigger.class)
    public JAXBElement<Double> createApexTriggerBodyCrc(Double value) {
        return new JAXBElement<Double>(_ApexTriggerBodyCrc_QNAME, Double.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeDelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeDelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeDelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTrigger.class)
    public JAXBElement<User> createApexTriggerCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageBeforeUpdate", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageBeforeUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageBeforeUpdate_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterUpdate", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterUpdate(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterUpdate_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = ApexTrigger.class)
    public JAXBElement<String> createApexTriggerTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexTrigger.class)
    public JAXBElement<Double> createApexTriggerApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexPageApiVersion_QNAME, Double.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterDelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterDelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterDelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexTrigger.class)
    public JAXBElement<User> createApexTriggerLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UsageAfterUndelete", scope = ApexTrigger.class)
    public JAXBElement<Boolean> createApexTriggerUsageAfterUndelete(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerUsageAfterUndelete_QNAME, Boolean.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexTrigger.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexTrigger.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTriggerMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexTriggerMember.class)
    public JAXBElement<ApexTriggerMetadata> createApexTriggerMemberMetadata(ApexTriggerMetadata value) {
        return new JAXBElement<ApexTriggerMetadata>(_ValidationRuleMetadata_QNAME, ApexTriggerMetadata.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTrigger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexTriggerMember.class)
    public JAXBElement<ApexTrigger> createApexTriggerMemberContentEntity(ApexTrigger value) {
        return new JAXBElement<ApexTrigger>(_ApexPageMemberContentEntity_QNAME, ApexTrigger.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexTriggerMember.class)
    public JAXBElement<SymbolTable> createApexTriggerMemberSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexTriggerMemberSymbolTable_QNAME, SymbolTable.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTriggerMember.class)
    public JAXBElement<User> createApexTriggerMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexTriggerMember.class)
    public JAXBElement<Boolean> createApexTriggerMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexTriggerMember.class)
    public JAXBElement<String> createApexTriggerMemberContentEntityId(String value) {
        return new JAXBElement<String>(_ApexPageMemberContentEntityId_QNAME, String.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexTriggerMember.class)
    public JAXBElement<User> createApexTriggerMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexTriggerMember.class)
    public JAXBElement<MetadataContainer> createApexTriggerMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexTriggerMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexTriggerMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexTriggerMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerKey", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentControllerKey(String value) {
        return new JAXBElement<String>(_ApexPageControllerKey_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ControllerType", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentControllerType(String value) {
        return new JAXBElement<String>(_ApexPageControllerType_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentDescription(String value) {
        return new JAXBElement<String>(_ApexPageDescription_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexComponent.class)
    public JAXBElement<Double> createApexComponentApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexPageApiVersion_QNAME, Double.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexComponent.class)
    public JAXBElement<User> createApexComponentLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexComponent.class)
    public JAXBElement<User> createApexComponentCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MasterLabel", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentMasterLabel(String value) {
        return new JAXBElement<String>(_ApexPageMasterLabel_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Markup", scope = ApexComponent.class)
    public JAXBElement<String> createApexComponentMarkup(String value) {
        return new JAXBElement<String>(_ApexPageMarkup_QNAME, String.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexComponent.class)
    public JAXBElement<XMLGregorianCalendar> createApexComponentLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CacheControl", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceCacheControl(String value) {
        return new JAXBElement<String>(_StaticResourceCacheControl_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentType", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceContentType(String value) {
        return new JAXBElement<String>(_StaticResourceContentType_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyLength", scope = StaticResource.class)
    public JAXBElement<Integer> createStaticResourceBodyLength(Integer value) {
        return new JAXBElement<Integer>(_StaticResourceBodyLength_QNAME, Integer.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = StaticResource.class)
    public JAXBElement<User> createStaticResourceCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = StaticResource.class)
    public JAXBElement<byte[]> createStaticResourceBody(byte[] value) {
        return new JAXBElement<byte[]>(_ApexPageMemberBody_QNAME, byte[].class, StaticResource.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = StaticResource.class)
    public JAXBElement<String> createStaticResourceDescription(String value) {
        return new JAXBElement<String>(_ApexPageDescription_QNAME, String.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = StaticResource.class)
    public JAXBElement<User> createStaticResourceLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = StaticResource.class)
    public JAXBElement<XMLGregorianCalendar> createStaticResourceLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, StaticResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "displayName", scope = AggregateExpressionResultColumnMetadata.class)
    public JAXBElement<String> createAggregateExpressionResultColumnMetadataDisplayName(String value) {
        return new JAXBElement<String>(_AggregateExpressionResultColumnMetadataDisplayName_QNAME, String.class, AggregateExpressionResultColumnMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Username", scope = Name.class)
    public JAXBElement<String> createNameUsername(String value) {
        return new JAXBElement<String>(_NameUsername_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Alias", scope = Name.class)
    public JAXBElement<String> createNameAlias(String value) {
        return new JAXBElement<String>(_NameAlias_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Email", scope = Name.class)
    public JAXBElement<String> createNameEmail(String value) {
        return new JAXBElement<String>(_NameEmail_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsActive", scope = Name.class)
    public JAXBElement<Boolean> createNameIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_NameIsActive_QNAME, Boolean.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastViewedDate", scope = Name.class)
    public JAXBElement<XMLGregorianCalendar> createNameLastViewedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NameLastViewedDate_QNAME, XMLGregorianCalendar.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = Name.class)
    public JAXBElement<String> createNameName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FirstName", scope = Name.class)
    public JAXBElement<String> createNameFirstName(String value) {
        return new JAXBElement<String>(_NameFirstName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Type", scope = Name.class)
    public JAXBElement<String> createNameType(String value) {
        return new JAXBElement<String>(_NameType_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Phone", scope = Name.class)
    public JAXBElement<String> createNamePhone(String value) {
        return new JAXBElement<String>(_NamePhone_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RecordTypeId", scope = Name.class)
    public JAXBElement<String> createNameRecordTypeId(String value) {
        return new JAXBElement<String>(_NameRecordTypeId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserRoleId", scope = Name.class)
    public JAXBElement<String> createNameUserRoleId(String value) {
        return new JAXBElement<String>(_NameUserRoleId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastReferencedDate", scope = Name.class)
    public JAXBElement<XMLGregorianCalendar> createNameLastReferencedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NameLastReferencedDate_QNAME, XMLGregorianCalendar.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Title", scope = Name.class)
    public JAXBElement<String> createNameTitle(String value) {
        return new JAXBElement<String>(_NameTitle_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastName", scope = Name.class)
    public JAXBElement<String> createNameLastName(String value) {
        return new JAXBElement<String>(_NameLastName_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ProfileId", scope = Name.class)
    public JAXBElement<String> createNameProfileId(String value) {
        return new JAXBElement<String>(_NameProfileId_QNAME, String.class, Name.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Subject", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskSubject(String value) {
        return new JAXBElement<String>(_WorkflowTaskSubject_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowTask.class)
    public JAXBElement<String> createWorkflowTaskNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowTask.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowTaskLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexOrgWideCoverage.class)
    public JAXBElement<String> createApexOrgWideCoverageCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexOrgWideCoverage.class)
    public JAXBElement<String> createApexOrgWideCoverageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "PercentCovered", scope = ApexOrgWideCoverage.class)
    public JAXBElement<Integer> createApexOrgWideCoveragePercentCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexOrgWideCoveragePercentCovered_QNAME, Integer.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexOrgWideCoverage.class)
    public JAXBElement<User> createApexOrgWideCoverageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexOrgWideCoverage.class)
    public JAXBElement<User> createApexOrgWideCoverageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexOrgWideCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexOrgWideCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexOrgWideCoverage.class)
    public JAXBElement<Boolean> createApexOrgWideCoverageIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexOrgWideCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveUser(User value) {
        return new JAXBElement<User>(_IDEWorkspaceUser_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = IDEPerspective.class)
    public JAXBElement<String> createIDEPerspectiveUserId(String value) {
        return new JAXBElement<String>(_IDEWorkspaceUserId_QNAME, String.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = IDEPerspective.class)
    public JAXBElement<User> createIDEPerspectiveCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = IDEPerspective.class)
    public JAXBElement<XMLGregorianCalendar> createIDEPerspectiveLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = IDEPerspective.class)
    public JAXBElement<Boolean> createIDEPerspectiveIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, IDEPerspective.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Description", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertDescription(String value) {
        return new JAXBElement<String>(_ApexPageDescription_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = WorkflowAlert.class)
    public JAXBElement<String> createWorkflowAlertNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = WorkflowAlert.class)
    public JAXBElement<XMLGregorianCalendar> createWorkflowAlertLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, WorkflowAlert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TracedEntityId", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagTracedEntityId(String value) {
        return new JAXBElement<String>(_TraceFlagTracedEntityId_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexCode", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagApexCode(String value) {
        return new JAXBElement<String>(_TraceFlagApexCode_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Scope", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagScope(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayActionScope_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "System", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagSystem(String value) {
        return new JAXBElement<String>(_TraceFlagSystem_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Callout", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagCallout(String value) {
        return new JAXBElement<String>(_TraceFlagCallout_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = TraceFlag.class)
    public JAXBElement<Boolean> createTraceFlagIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Database", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagDatabase(String value) {
        return new JAXBElement<String>(_TraceFlagDatabase_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Workflow", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagWorkflow(String value) {
        return new JAXBElement<String>(_TraceFlagWorkflow_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Visualforce", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagVisualforce(String value) {
        return new JAXBElement<String>(_TraceFlagVisualforce_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayActionExpirationDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Validation", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagValidation(String value) {
        return new JAXBElement<String>(_TraceFlagValidation_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ScopeId", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagScopeId(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionScopeId_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexProfiling", scope = TraceFlag.class)
    public JAXBElement<String> createTraceFlagApexProfiling(String value) {
        return new JAXBElement<String>(_TraceFlagApexProfiling_QNAME, String.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TracedEntity", scope = TraceFlag.class)
    public JAXBElement<Name> createTraceFlagTracedEntity(Name value) {
        return new JAXBElement<Name>(_TraceFlagTracedEntity_QNAME, Name.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = TraceFlag.class)
    public JAXBElement<User> createTraceFlagLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = TraceFlag.class)
    public JAXBElement<XMLGregorianCalendar> createTraceFlagLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, TraceFlag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = ApexClass.class)
    public JAXBElement<String> createApexClassFullName(String value) {
        return new JAXBElement<String>(_ValidationRuleFullName_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsValid", scope = ApexClass.class)
    public JAXBElement<Boolean> createApexClassIsValid(Boolean value) {
        return new JAXBElement<Boolean>(_ApexTriggerIsValid_QNAME, Boolean.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexClass.class)
    public JAXBElement<String> createApexClassCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Name", scope = ApexClass.class)
    public JAXBElement<String> createApexClassName(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateName_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexClass.class)
    public JAXBElement<String> createApexClassStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = ApexClass.class)
    public JAXBElement<String> createApexClassNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LengthWithoutComments", scope = ApexClass.class)
    public JAXBElement<Integer> createApexClassLengthWithoutComments(Integer value) {
        return new JAXBElement<Integer>(_ApexTriggerLengthWithoutComments_QNAME, Integer.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "BodyCrc", scope = ApexClass.class)
    public JAXBElement<Double> createApexClassBodyCrc(Double value) {
        return new JAXBElement<Double>(_ApexTriggerBodyCrc_QNAME, Double.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClassMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexClass.class)
    public JAXBElement<ApexClassMetadata> createApexClassMetadata(ApexClassMetadata value) {
        return new JAXBElement<ApexClassMetadata>(_ValidationRuleMetadata_QNAME, ApexClassMetadata.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexClass.class)
    public JAXBElement<SymbolTable> createApexClassSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexTriggerMemberSymbolTable_QNAME, SymbolTable.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexClass.class)
    public JAXBElement<User> createApexClassCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexClass.class)
    public JAXBElement<String> createApexClassLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexClass.class)
    public JAXBElement<String> createApexClassBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApiVersion", scope = ApexClass.class)
    public JAXBElement<Double> createApexClassApiVersion(Double value) {
        return new JAXBElement<Double>(_ApexPageApiVersion_QNAME, Double.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexClass.class)
    public JAXBElement<User> createApexClassLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexClass.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTrigger", scope = ApexCodeCoverage.class)
    public JAXBElement<Name> createApexCodeCoverageApexClassOrTrigger(Name value) {
        return new JAXBElement<Name>(_ApexCodeCoverageApexClassOrTrigger_QNAME, Name.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Coverage", scope = ApexCodeCoverage.class)
    public JAXBElement<Coverage> createApexCodeCoverageCoverage(Coverage value) {
        return new JAXBElement<Coverage>(_ApexCodeCoverageCoverage_QNAME, Coverage.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexTestClass", scope = ApexCodeCoverage.class)
    public JAXBElement<ApexClass> createApexCodeCoverageApexTestClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexCodeCoverageApexTestClass_QNAME, ApexClass.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexTestClassId", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageApexTestClassId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexTestClassId_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TestMethodName", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageTestMethodName(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageTestMethodName_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexCodeCoverage.class)
    public JAXBElement<User> createApexCodeCoverageCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexCodeCoverage.class)
    public JAXBElement<Boolean> createApexCodeCoverageIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTriggerId", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageApexClassOrTriggerId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexClassOrTriggerId_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexCodeCoverage.class)
    public JAXBElement<String> createApexCodeCoverageLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesCovered", scope = ApexCodeCoverage.class)
    public JAXBElement<Integer> createApexCodeCoverageNumLinesCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesCovered_QNAME, Integer.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesUncovered", scope = ApexCodeCoverage.class)
    public JAXBElement<Integer> createApexCodeCoverageNumLinesUncovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesUncovered_QNAME, Integer.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexCodeCoverage.class)
    public JAXBElement<User> createApexCodeCoverageLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexCodeCoverage.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExtendedStatus", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobExtendedStatus(String value) {
        return new JAXBElement<String>(_AsyncApexJobExtendedStatus_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MethodName", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobMethodName(String value) {
        return new JAXBElement<String>(_AsyncApexJobMethodName_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumberOfErrors", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobNumberOfErrors(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobNumberOfErrors_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "JobType", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobJobType(String value) {
        return new JAXBElement<String>(_AsyncApexJobJobType_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompletedDate", scope = AsyncApexJob.class)
    public JAXBElement<XMLGregorianCalendar> createAsyncApexJobCompletedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AsyncApexJobCompletedDate_QNAME, XMLGregorianCalendar.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = AsyncApexJob.class)
    public JAXBElement<ApexClass> createAsyncApexJobApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_AsyncApexJobApexClass_QNAME, ApexClass.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "JobItemsProcessed", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobJobItemsProcessed(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobJobItemsProcessed_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = AsyncApexJob.class)
    public JAXBElement<User> createAsyncApexJobCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = AsyncApexJob.class)
    public JAXBElement<XMLGregorianCalendar> createAsyncApexJobCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastProcessed", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobLastProcessed(String value) {
        return new JAXBElement<String>(_AsyncApexJobLastProcessed_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ParentJobId", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobParentJobId(String value) {
        return new JAXBElement<String>(_AsyncApexJobParentJobId_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = AsyncApexJob.class)
    public JAXBElement<String> createAsyncApexJobApexClassId(String value) {
        return new JAXBElement<String>(_AsyncApexJobApexClassId_QNAME, String.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TotalJobItems", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobTotalJobItems(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobTotalJobItems_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastProcessedOffset", scope = AsyncApexJob.class)
    public JAXBElement<Integer> createAsyncApexJobLastProcessedOffset(Integer value) {
        return new JAXBElement<Integer>(_AsyncApexJobLastProcessedOffset_QNAME, Integer.class, AsyncApexJob.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "OverlayResultLength", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultOverlayResultLength(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayResultOverlayResultLength_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Line", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultLine(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayActionLine_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ClassName", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultClassName(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultClassName_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Namespace", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultNamespace(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultNamespace_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Boolean> createApexExecutionOverlayResultIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RequestedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultRequestedBy(User value) {
        return new JAXBElement<User>(_ApexExecutionOverlayResultRequestedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "RequestedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultRequestedById(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayResultRequestedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeapDump }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "HeapDump", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<HeapDump> createApexExecutionOverlayResultHeapDump(HeapDump value) {
        return new JAXBElement<HeapDump>(_ApexExecutionOverlayResultHeapDump_QNAME, HeapDump.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScript", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultActionScript(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionActionScript_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Iteration", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Integer> createApexExecutionOverlayResultIteration(Integer value) {
        return new JAXBElement<Integer>(_ApexExecutionOverlayActionIteration_QNAME, Integer.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "User", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Name> createApexExecutionOverlayResultUser(Name value) {
        return new JAXBElement<Name>(_IDEWorkspaceUser_QNAME, Name.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExpirationDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexExecutionOverlayActionExpirationDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDumpingHeap", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<Boolean> createApexExecutionOverlayResultIsDumpingHeap(Boolean value) {
        return new JAXBElement<Boolean>(_ApexExecutionOverlayActionIsDumpingHeap_QNAME, Boolean.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOQLResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SOQLResult", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<SOQLResult> createApexExecutionOverlayResultSOQLResult(SOQLResult value) {
        return new JAXBElement<SOQLResult>(_ApexExecutionOverlayResultSOQLResult_QNAME, SOQLResult.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserId", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultUserId(String value) {
        return new JAXBElement<String>(_IDEWorkspaceUserId_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<User> createApexExecutionOverlayResultLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexResult", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<ApexResult> createApexExecutionOverlayResultApexResult(ApexResult value) {
        return new JAXBElement<ApexResult>(_ApexExecutionOverlayResultApexResult_QNAME, ApexResult.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexExecutionOverlayResultLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ActionScriptType", scope = ApexExecutionOverlayResult.class)
    public JAXBElement<String> createApexExecutionOverlayResultActionScriptType(String value) {
        return new JAXBElement<String>(_ApexExecutionOverlayActionActionScriptType_QNAME, String.class, ApexExecutionOverlayResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTestQueueItem.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestQueueItemSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExtendedStatus", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemExtendedStatus(String value) {
        return new JAXBElement<String>(_AsyncApexJobExtendedStatus_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ParentJobId", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemParentJobId(String value) {
        return new JAXBElement<String>(_AsyncApexJobParentJobId_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = ApexTestQueueItem.class)
    public JAXBElement<String> createApexTestQueueItemApexClassId(String value) {
        return new JAXBElement<String>(_AsyncApexJobApexClassId_QNAME, String.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = ApexTestQueueItem.class)
    public JAXBElement<ApexClass> createApexTestQueueItemApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_AsyncApexJobApexClass_QNAME, ApexClass.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexTestQueueItem.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestQueueItemCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexTestQueueItem.class)
    public JAXBElement<User> createApexTestQueueItemCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexTestQueueItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexTestResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestResultSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QueueItemId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultQueueItemId(String value) {
        return new JAXBElement<String>(_ApexTestResultQueueItemId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MethodName", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultMethodName(String value) {
        return new JAXBElement<String>(_AsyncApexJobMethodName_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexTestQueueItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "QueueItem", scope = ApexTestResult.class)
    public JAXBElement<ApexTestQueueItem> createApexTestResultQueueItem(ApexTestQueueItem value) {
        return new JAXBElement<ApexTestQueueItem>(_ApexTestResultQueueItem_QNAME, ApexTestQueueItem.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "StackTrace", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultStackTrace(String value) {
        return new JAXBElement<String>(_ApexTestResultStackTrace_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClass", scope = ApexTestResult.class)
    public JAXBElement<ApexClass> createApexTestResultApexClass(ApexClass value) {
        return new JAXBElement<ApexClass>(_AsyncApexJobApexClass_QNAME, ApexClass.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TestTimestamp", scope = ApexTestResult.class)
    public JAXBElement<XMLGregorianCalendar> createApexTestResultTestTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexTestResultTestTimestamp_QNAME, XMLGregorianCalendar.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Message", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultMessage(String value) {
        return new JAXBElement<String>(_ApexTestResultMessage_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexLogId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultApexLogId(String value) {
        return new JAXBElement<String>(_ApexTestResultApexLogId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultApexClassId(String value) {
        return new JAXBElement<String>(_AsyncApexJobApexClassId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsyncApexJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AsyncApexJob", scope = ApexTestResult.class)
    public JAXBElement<AsyncApexJob> createApexTestResultAsyncApexJob(AsyncApexJob value) {
        return new JAXBElement<AsyncApexJob>(_ApexTestResultAsyncApexJob_QNAME, AsyncApexJob.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "AsyncApexJobId", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultAsyncApexJobId(String value) {
        return new JAXBElement<String>(_ApexTestResultAsyncApexJobId_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Outcome", scope = ApexTestResult.class)
    public JAXBElement<String> createApexTestResultOutcome(String value) {
        return new JAXBElement<String>(_ApexTestResultOutcome_QNAME, String.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexLog", scope = ApexTestResult.class)
    public JAXBElement<ApexLog> createApexTestResultApexLog(ApexLog value) {
        return new JAXBElement<ApexLog>(_ApexTestResultApexLog_QNAME, ApexLog.class, ApexTestResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DelegatedUsers", scope = User.class)
    public JAXBElement<QueryResult> createUserDelegatedUsers(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserDelegatedUsers_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "UserPreferences", scope = User.class)
    public JAXBElement<QueryResult> createUserUserPreferences(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserUserPreferences_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "WorkspaceId", scope = User.class)
    public JAXBElement<String> createUserWorkspaceId(String value) {
        return new JAXBElement<String>(_UserWorkspaceId_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ManagedUsers", scope = User.class)
    public JAXBElement<QueryResult> createUserManagedUsers(QueryResult value) {
        return new JAXBElement<QueryResult>(_UserManagedUsers_QNAME, QueryResult.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "FullName", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldFullName(String value) {
        return new JAXBElement<String>(_ValidationRuleFullName_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "TableEnumOrId", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldTableEnumOrId(String value) {
        return new JAXBElement<String>(_ValidationRuleTableEnumOrId_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = CustomField.class)
    public JAXBElement<CustomFieldMetadata> createCustomFieldMetadata(CustomFieldMetadata value) {
        return new JAXBElement<CustomFieldMetadata>(_ValidationRuleMetadata_QNAME, CustomFieldMetadata.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = CustomField.class)
    public JAXBElement<XMLGregorianCalendar> createCustomFieldLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CustomField.class)
    public JAXBElement<String> createCustomFieldDeveloperName(String value) {
        return new JAXBElement<String>(_CustomFieldDeveloperName_QNAME, String.class, CustomField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Application", scope = ApexLog.class)
    public JAXBElement<String> createApexLogApplication(String value) {
        return new JAXBElement<String>(_ApexLogApplication_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Operation", scope = ApexLog.class)
    public JAXBElement<String> createApexLogOperation(String value) {
        return new JAXBElement<String>(_ApexLogOperation_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DurationMilliseconds", scope = ApexLog.class)
    public JAXBElement<Integer> createApexLogDurationMilliseconds(Integer value) {
        return new JAXBElement<Integer>(_ApexLogDurationMilliseconds_QNAME, Integer.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogUserId", scope = ApexLog.class)
    public JAXBElement<String> createApexLogLogUserId(String value) {
        return new JAXBElement<String>(_ApexLogLogUserId_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Status", scope = ApexLog.class)
    public JAXBElement<String> createApexLogStatus(String value) {
        return new JAXBElement<String>(_ApexTriggerStatus_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogUser", scope = ApexLog.class)
    public JAXBElement<Name> createApexLogLogUser(Name value) {
        return new JAXBElement<Name>(_ApexLogLogUser_QNAME, Name.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LogLength", scope = ApexLog.class)
    public JAXBElement<Integer> createApexLogLogLength(Integer value) {
        return new JAXBElement<Integer>(_ApexLogLogLength_QNAME, Integer.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Request", scope = ApexLog.class)
    public JAXBElement<String> createApexLogRequest(String value) {
        return new JAXBElement<String>(_ApexLogRequest_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "StartTime", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexLogStartTime_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Location", scope = ApexLog.class)
    public JAXBElement<String> createApexLogLocation(String value) {
        return new JAXBElement<String>(_ApexLogLocation_QNAME, String.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexLog.class)
    public JAXBElement<XMLGregorianCalendar> createApexLogLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexLog.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Content", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberContent(String value) {
        return new JAXBElement<String>(_ApexPageMemberContent_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClassMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Metadata", scope = ApexClassMember.class)
    public JAXBElement<ApexClassMetadata> createApexClassMemberMetadata(ApexClassMetadata value) {
        return new JAXBElement<ApexClassMetadata>(_ValidationRuleMetadata_QNAME, ApexClassMetadata.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApexClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntity", scope = ApexClassMember.class)
    public JAXBElement<ApexClass> createApexClassMemberContentEntity(ApexClass value) {
        return new JAXBElement<ApexClass>(_ApexPageMemberContentEntity_QNAME, ApexClass.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SymbolTable", scope = ApexClassMember.class)
    public JAXBElement<SymbolTable> createApexClassMemberSymbolTable(SymbolTable value) {
        return new JAXBElement<SymbolTable>(_ApexTriggerMemberSymbolTable_QNAME, SymbolTable.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexClassMember.class)
    public JAXBElement<User> createApexClassMemberCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexClassMember.class)
    public JAXBElement<Boolean> createApexClassMemberIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Body", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberBody(String value) {
        return new JAXBElement<String>(_ApexPageMemberBody_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ContentEntityId", scope = ApexClassMember.class)
    public JAXBElement<String> createApexClassMemberContentEntityId(String value) {
        return new JAXBElement<String>(_ApexPageMemberContentEntityId_QNAME, String.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexClassMember.class)
    public JAXBElement<User> createApexClassMemberLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ApexClassMember.class)
    public JAXBElement<MetadataContainer> createApexClassMemberMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastSyncDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberLastSyncDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberLastSyncDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexClassMember.class)
    public JAXBElement<XMLGregorianCalendar> createApexClassMemberLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexClassMember.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalDataSource", scope = CustomObject.class)
    public JAXBElement<Name> createCustomObjectExternalDataSource(Name value) {
        return new JAXBElement<Name>(_CustomObjectExternalDataSource_QNAME, Name.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NamespacePrefix", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectNamespacePrefix(String value) {
        return new JAXBElement<String>(_WorkflowFieldUpdateNamespacePrefix_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ExternalDataSourceId", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectExternalDataSourceId(String value) {
        return new JAXBElement<String>(_CustomObjectExternalDataSourceId_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = CustomObject.class)
    public JAXBElement<XMLGregorianCalendar> createCustomObjectLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "DeveloperName", scope = CustomObject.class)
    public JAXBElement<String> createCustomObjectDeveloperName(String value) {
        return new JAXBElement<String>(_CustomFieldDeveloperName_QNAME, String.class, CustomObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTrigger", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Name> createApexCodeCoverageAggregateApexClassOrTrigger(Name value) {
        return new JAXBElement<Name>(_ApexCodeCoverageApexClassOrTrigger_QNAME, Name.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "Coverage", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Coverage> createApexCodeCoverageAggregateCoverage(Coverage value) {
        return new JAXBElement<Coverage>(_ApexCodeCoverageCoverage_QNAME, Coverage.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CoverageLastModifiedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateCoverageLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexCodeCoverageAggregateCoverageLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<User> createApexCodeCoverageAggregateCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Boolean> createApexCodeCoverageAggregateIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ApexClassOrTriggerId", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateApexClassOrTriggerId(String value) {
        return new JAXBElement<String>(_ApexCodeCoverageApexClassOrTriggerId_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<String> createApexCodeCoverageAggregateLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesCovered", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Integer> createApexCodeCoverageAggregateNumLinesCovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesCovered_QNAME, Integer.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "NumLinesUncovered", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<Integer> createApexCodeCoverageAggregateNumLinesUncovered(Integer value) {
        return new JAXBElement<Integer>(_ApexCodeCoverageNumLinesUncovered_QNAME, Integer.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<User> createApexCodeCoverageAggregateLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ApexCodeCoverageAggregate.class)
    public JAXBElement<XMLGregorianCalendar> createApexCodeCoverageAggregateLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ApexCodeCoverageAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "SystemModstamp", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestSystemModstamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberSystemModstamp_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedById", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestCreatedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberCreatedById_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "State", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestState(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestState_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsCheckOnly", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsCheckOnly(Boolean value) {
        return new JAXBElement<Boolean>(_ContainerAsyncRequestIsCheckOnly_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerId", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestMetadataContainerId(String value) {
        return new JAXBElement<String>(_ApexPageMemberMetadataContainerId_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CompilerErrors", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestCompilerErrors(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestCompilerErrors_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsRunTests", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsRunTests(Boolean value) {
        return new JAXBElement<Boolean>(_ContainerAsyncRequestIsRunTests_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "ErrorMsg", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestErrorMsg(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestErrorMsg_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerMemberId", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestMetadataContainerMemberId(String value) {
        return new JAXBElement<String>(_ContainerAsyncRequestMetadataContainerMemberId_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedBy", scope = ContainerAsyncRequest.class)
    public JAXBElement<User> createContainerAsyncRequestCreatedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberCreatedBy_QNAME, User.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "CreatedDate", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApexPageMemberCreatedDate_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "IsDeleted", scope = ContainerAsyncRequest.class)
    public JAXBElement<Boolean> createContainerAsyncRequestIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_ApexPageMemberIsDeleted_QNAME, Boolean.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainerMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainerMember", scope = ContainerAsyncRequest.class)
    public JAXBElement<MetadataContainerMember> createContainerAsyncRequestMetadataContainerMember(MetadataContainerMember value) {
        return new JAXBElement<MetadataContainerMember>(_ContainerAsyncRequestMetadataContainerMember_QNAME, MetadataContainerMember.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedById", scope = ContainerAsyncRequest.class)
    public JAXBElement<String> createContainerAsyncRequestLastModifiedById(String value) {
        return new JAXBElement<String>(_ApexPageMemberLastModifiedById_QNAME, String.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedBy", scope = ContainerAsyncRequest.class)
    public JAXBElement<User> createContainerAsyncRequestLastModifiedBy(User value) {
        return new JAXBElement<User>(_ApexPageMemberLastModifiedBy_QNAME, User.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataContainer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "MetadataContainer", scope = ContainerAsyncRequest.class)
    public JAXBElement<MetadataContainer> createContainerAsyncRequestMetadataContainer(MetadataContainer value) {
        return new JAXBElement<MetadataContainer>(_ApexPageMemberMetadataContainer_QNAME, MetadataContainer.class, ContainerAsyncRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:tooling.soap.sforce.com", name = "LastModifiedDate", scope = ContainerAsyncRequest.class)
    public JAXBElement<XMLGregorianCalendar> createContainerAsyncRequestLastModifiedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WorkflowFieldUpdateLastModifiedDate_QNAME, XMLGregorianCalendar.class, ContainerAsyncRequest.class, value);
    }

}

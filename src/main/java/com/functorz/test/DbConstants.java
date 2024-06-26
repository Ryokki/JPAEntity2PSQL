package com.functorz.test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class DbConstants {
  public static final long INCREMENT = 10_000_000_000_000L;

  public static final long ACCOUNT_OFFSET = 100L;
  public static final long ROLE_OFFSET = 101L;
  public static final long ROLE_PERMISSION_OFFSET = 102L;
  public static final long ACCOUNT_ROLE_OFFSET = 103L;
  public static final long VERIFICATION_CODE_OFFSET = 104L;
  public static final long FEEDBACK_OFFSET = 105L;
  public static final long ACCOUNT_LEVEL_OFFSET = 106L;
  public static final long LEVEL_OFFSET = 107L;
  public static final long ORGANIZATION_OFFSET = 108L;
  public static final long ORGANIZATION_MEMBER_OFFSET = 109L;
  public static final long EXTERNAL_USER_GROUP_ACCOUNT_OFFSET = 110L;
  public static final long FEATURE_GATE_OFFSET = 111L;
  public static final long ACCOUNT_FEATURE_OFFSET = 112L;
  public static final long USER_QUESTION_OFFSET = 113L;
  public static final long USER_CHOICE_OFFSET = 114L;
  public static final long USER_QUESTION_ANSWER_OFFSET = 115L;
  public static final long ORGANIZATION_HAS_RESOURCE_OFFSET = 116L;
  public static final long ACCOUNT_READ_PROJECT_OFFSET = 117L;
  public static final long ORGANIZATION_HAS_ZIROOM_OFFSET = 118L;
  public static final long ACCOUNT_READ_APP_OFFSET = 119L;
  public static final long ACCOUNT_READ_WECHAT_MINI_PROGRAM_APP_OFFSET = 120L;
  public static final long ACCOUNT_COMBINATION_REQUEST_OFFSET = 130L;
  public static final long INVITATION_TOKEN_OFFSET = 131L;
  public static final long ORDER_PRODUCT_BURST_RECORD_OFFSET = 132L;
  public static final long ACCOUNT_MODULE_OFFSET = 132L;
  public static final long BANNER_ITEM_OFFSET = 133L;
  public static final long AI_FEATURE_OFFSET = 134L;
  public static final long PROJECT_FEATURE_OFFSET = 135L;

  public static final long PROJECT_OFFSET = 200L;
  public static final long CLOUD_CONFIGURATION_OFFSET = 201L;
  public static final long PROJECT_MEDIA_RECORD_OFFSET = 202L;
  public static final long PROJECT_ACCOUNT_OFFSET = 203L;
  public static final long SHARE_TOKEN_OFFSET = 204L;
  public static final long PROJECT_TRANSFER_OFFSET = 205L;
  public static final long PROJECT_GRAPHQL_TYPE_NAME_OFFSET = 206L;
  public static final long ZIROOM_SERVER_OFFSET = 207L;
  public static final long PROJECT_DEPLOYMENT_INFO_OFFSET = 208L;
  public static final long PROJECT_HAS_RESOURCE_OFFSET = 209L;
  public static final long PROJECT_RESOURCE_USAGE_OFFSET = 212L;
  public static final long PROJECT_MODULE_OFFSET = 213L;
  public static final long PROJECT_HIBERNATION_RECORD_OFFSET = 214L;
  public static final long PROJECT_ACTIVATION_RECORD_OFFSET = 215L;
  public static final long ORGANIZATION_RESOURCE_USAGE_OFFSET = 216L;
  public static final long BEGINNER_GUIDE_OFFSET = 217L;
  public static final long WEB_APP_OFFSET = 218L;
  public static final long WECHAT_MINI_PROGRAM_APP_OFFSET = 219L;
  public static final long CERTIFICATE_OFFSET = 220L;
  public static final long DOMAIN_CERTIFICATE_OFFSET = 221L;
  public static final long TUTORIAL_TEMPLATE_STEPS_OFFSET = 222L;
  public static final long TEMPLATE_STEP_AND_ACCOUNT_OFFSET = 223L;
  public static final long ADVANCED_FUNCTIONALITY_TUTORIAL_OFFSET = 224L;
  public static final long USER_TUTORIAL_PREFERENCE_OFFSET = 225L;
  public static final long WEB_APP_ACCOUNT_OFFSET = 226L;
  public static final long WECHAT_MINI_PROGRAM_APP_ACCOUNT_OFFSET = 227L;
  public static final long DATA_VISUALIZER_ACCOUNT_OFFSET = 228L;
  public static final long DATA_VISUALIZER_DRAFT_OFFSET = 249L;
  public static final long DATA_VISUALIZER_OFFSET = 250L;
  public static final long CUSTOM_VIEW_OFFSET = 251L;
  public static final long PROJECT_RESET_RECORD_OFFSET = 252L;

  public static final long PROJECT_SCHEMA_OFFSET = 300L;
  public static final long DEPLOYMENT_EVENT_OFFSET = 301L;
  public static final long WECHAT_MINIPROGRAM_AUDIT_OFFSET = 302L;
  public static final long PROJECT_TEMPLATE_OFFSET = 303L;
  public static final long PROJECT_WITH_TEMPLATE_OFFSET = 304L;
  public static final long COMPONENT_TEMPLATE_OFFSET = 305L;
  public static final long PROJECT_FUNCTOR_OFFSET = 306L;
  public static final long DEPLOYMENT_ENV_CONFIG_OFFSET = 307L;
  public static final long PROJECT_SCHEDULED_JOB_OFFSET = 308L;
  public static final long DEPLOYMENT_OUTPUT_OFFSET = 309L;
  public static final long SCHEMA_DIFF_OFFSET = 310L;
  public static final long GITLAB_RUNNER_RECORD_OFFSET = 311L;
  public static final long WECHAT_TEMPLATE_APP_OFFSET = 312L;
  public static final long DRY_RUN_RECORD_OFFSET = 313L;
  public static final long FAILURE_EVENT_RECORD_OFFSET = 314L;
  public static final long LATEST_SUCCESSFUL_DEPLOYMENT_OFFSET = 315L;
  public static final long DEPLOYMENT_RECORD_OFFSET = 316L;
  public static final long SYNC_DATA_ERROR_LOG_OFFSET = 317L;
  public static final long RESTORATION_RECORD_OFFSET = 318L;
  public static final long TOKEN_SYNCHRONIZE_FAILURE = 319L;
  public static final long ACTION_FLOW_ENTITY_OFFSET = 320L;
  public static final long DEPLOYMENT_STATUS_READ_OFFSET = 321L;
  public static final long AUDIT_STATUS_READ_OFFSET = 322L;
  public static final long SCHEMA_MODULE_INSTANCE_OFFSET = 323L;
  public static final long CATEGORY = 324L;
  public static final long TEMPLATE_CATEGORY = 325L;
  public static final long TEMPLATE_AUDIT_RECORD = 326L;
  public static final long ACCOUNT_TEMPLATE = 327L;
  public static final long COMPUTING_POWER_CART_OFFSET = 328L;
  public static final long COMPUTING_POWER_CART_ITEM_OFFSET = 329L;
  public static final long COMPUTING_POWER_KIT_OFFSET = 330L;
  public static final long COMPUTINT_POWER_KIT_RESOURCE_OFFSET = 331L;
  public static final long COMPUTING_POWER_ADDON_OFFSET = 332L;
  public static final long COMPUTING_POWER_ADDON_RESOURCE_OFFSET = 333L;
  public static final long WECHAT_MINI_PROGRAM_APP_SCHEMA_OFFSET = 334L;
  public static final long WEB_APP_SCHEMA_OFFSET = 335L;
  public static final long WEB_APP_SCHEMA_DIFF_OFFSET = 336L;
  public static final long WECHAT_MINI_PROGRAM_APP_SCHEMA_DIFF_OFFSET = 337L;
  public static final long CUSTOM_COMPONENT_OFFSET = 338L;
  public static final long WEB_APP_DEPLOYMENT_RECORD_OFFSET = 339L;
  public static final long WEB_APP_DEPLOYMENT_EVENT_OFFSET = 340L;
  public static final long WEB_APP_DEPLOYMENT_OUTPUT_OFFSET = 341L;
  public static final long MULTI_CLIENTS_DEPLOYMENT_RECORD_OFFSET = 342L;
  public static final long DEPLOYMENT_ERROR_HANDLING_OFFSET = 343L;
  public static final long CUSTOM_COMPONENT_ITEMS_OFFSET = 344L;
  public static final long PROJECT_HAS_CUSTOM_COMPONENT = 345L;
  public static final long CUSTOM_COMPONENT_ERROR_LOG_OFFSET = 346L;
  public static final long CUSTOM_COMPONENT_ITEM_PARAMETER_OFFSET = 347L;
  public static final long WEB_APP_VERSION_OFFSET = 339L;
  public static final long WECHAT_MINI_PROGRAM_APP_VERSION_OFFSET = 340L;
  public static final long PROJECT_VERSION_ITEM_OFFSET = 341L;
  public static final long PROJECT_VERSION_OFFSET = 342L;
  public static final long ZIROOM_PROJECT_MIGRATION_APPOINTMENT_OFFSET = 343L;

  public static final long TABLE_METADATA_ENTITY_OFFSET = 400L;
  public static final long COLUMN_METADATA_ENTITY_OFFSET = 401L;
  public static final long RELATION_METADATA_ENTITY_OFFSET = 402L;
  public static final long EVENT_TRIGGER_OFFSET = 403L;
  public static final long MAPPING_OFFSET = 404L;
  public static final long SUBSYSTEM_RECORD_OFFSET = 405L;
  public static final long GLOBAL_CONDITION_OFFSET = 407L;
  public static final long WECHAT_AUTHORIZATION_EVENT_OFFSET = 408L;
  public static final long WECHAT_OFFICIAL_ACCOUNT_SUBSCRIPTION_OFFSET = 409L;
  public static final long WECHAT_TEMPLATE_LIST_RECORD_OFFSET = 410L;
  public static final long MESSAGE_CONTENT_OFFSET = 410L;
  public static final long MESSAGE_OFFSET = 411L;
  public static final long PURCHASE_ORDER_OFFSET = 412L;
  public static final long PLAN_TYPE_PRICE_OFFSET = 413;
  public static final long PLAN_TYPE_INFO_OFFSET = 414;
  public static final long OAUTH2_SCOPE_PROPERTIES = 416;
  public static final long ACCOUNT_OAUTH2_CLIENT = 417;
  public static final long PROJECT_RESOURCE_USAGE_ENTRY_OFFSET = 418L;
  public static final long FAILED_SCHEMA_MIGRATION_LOG = 449L;
  public static final long DATA_MIGRATION_OFFSET = 450L;
  public static final long PRODUCT_OFFSET = 451L;
  public static final long ORDER_PRODUCT_OFFSET = 452L;
  public static final long STRIPE_PRODUCT_INFO_OFFSET = 453L;
  public static final long STRIPE_SUBSCRIPTION_OFFSET = 454L;
  public static final long STRIPE_INVOICE_OFFSET = 455L;
  public static final long STRIPE_CUSTOMER_INFO_OFFSET = 456L;
  public static final long STRIPE_EVENT_OFFSET = 457L;
  public static final long STRIPE_SESSION_OFFSET = 457L;
  public static final long ALIPAY_SUBSCRIPTION_OFFSET = 458L;
  public static final long ALI_PAYMENT_INFO_OFFSET = 459L;
  public static final long ACCOUNT_SIGN_SCENE_OFFSET = 460L;

  public static final long REQUEST_CONTENT_QUERY_ID_OFFSET = 500L;
  public static final long PDF_TO_MD_TASK_ID_OFFSET = 501L;

  public static final long REDEMPTION_CODE_OFFSET = 600L;

  public static final long GLOBAL_STORED_IMAGE_OFFSET = 700L;
  public static final long GLOBAL_STORED_VIDEO_OFFSET = 701L;
  public static final long GLOBAL_STORED_FILE_OFFSET = 702L;
  public static final long MODULE_OFFSET = 703L;

  public static final long PAYMENT_OFFSET = 800L;
  public static final long PURCHASER_OFFSET = 801L;
  public static final long PLAN_OFFSET = 802L;
  public static final long PAYMENT_REFUND_OFFSET = 803L;
  public static final long STRIPE_PAYMENT_INFO_OFFSET = 804L;
  public static final long PROMO_CODE_OFFSET = 833L;
  public static final long PROMO_CODE_PRODUCT_RULE_OFFSET = 834L;
  public static final long COMMISSION_RULE_OFFSET = 835L;
  public static final long COMMISSION_OFFSET = 836L;
  public static final long ALIPAY_ACCOUNT_OFFSET = 837L;
  public static final long STRIPE_ACCOUNT_OFFSET = 838L;
  public static final long STRIPE_TRANSFER_INFO_OFFSET = 840L;
  public static final long ALIPAY_TRANSFER_INFO_OFFSET = 841L;
  public static final long STRIPE_TRANSFER_REFUND_OFFSET = 842L;
  public static final long ALIPAY_TRANSFER_REFUND_OFFSET = 843L;
  public static final long COMMISSION_ITEM_OFFSET = 844L;
  public static final long COUPON_TEMPLATE_OFFSET = 845;

  public static final long ALIYUN_SMS_OFFSET = 900L;
  public static final long ALIYUN_SMS_TEMPLATE_OFFSET = 901L;
  public static final long PROJECT_PLAN_FROM_PACKAGE_OFFSET = 902L;
  public static final long PROJECT_PLAN_FROM_PURCHASE_OFFSET = 903L;
  public static final long PROJECT_PLAN_PACKAGE_OFFSET = 904L;
  public static final long ACCOUNT_AI_ASSISTANT_OFFSET = 905L;
  public static final long APP_AI_TOKEN_DAILY_USAGE_OFFSET = 906L;
  public static final long OUTFLOW_DAILY_USAGE_OFFSET = 907L;
  public static final long WXWORK_CORP_INFO_OFFSET = 907L;
  public static final long DINGTALK_EVENT_OFFSET = 909L;
  public static final long SESSION_POINTER_COORD_OFFSET = 910L;
  public static final long SUBSCRIBER_OFFSET = 911L;
  public static final long WECHAT_APP_DEPLOYMENT_RECORD_OFFSET = 912L;
  public static final long WECHAT_APP_DEPLOYMENT_EVENT_OFFSET = 913L;
  public static final long WECHAT_APP_DEPLOYMENT_OUTPUT_OFFSET = 914L;
  public static final long POPUP_OFFSET = 915L;
  public static final long ORGANIZATION_MIGRATION_OFFSET = 916L;
  public static final long PROJECT_CONFIG_AND_VERSION_OFFSET = 917L;
  public static final long WEB_CONFIG_AND_VERSION_OFFSET = 918L;
  public static final long WECHAT_MINI_PROGRAM_CONFIG_AND_VERSION_OFFSET = 919L;
  public static final long ALIPAY_CALLBACK_OFFSET = 920L;
  public static final long PROJECT_RESOURCE_SOURCE_OFFSET = 921L;
  public static final long ORGANIZATION_RESOURCE_SOURCE_OFFSET = 922L;
  public static final long PROJECT_RESOURCE_CONSUMPTION_RECORD_OFFSET = 923L;
  public static final long PROJECT_RESOURCE_CREDIT_USAGE_OFFSET = 924L;
  public static final long ENV_MERGE_RECORD_OFFSET = 925L;
  public static final long MESSAGE_POPUP_OFFSET = 926L;
  public static final long PRE_CREATED_PROJECT_OFFSET = 927L;
  public static final long PROJECT_TEMPLATE_FEEDBACK_OFFSET = 928L;
  public static final long PROJECT_AUTO_DELETION_RECORD_OFFSET = 929L;
  public static final long PRE_CREATED_PROJECT_HIT_RECORD_OFFSET = 930L;
  public static final long ZIROOM_PROJECT_MIGRATION_RECORD_OFFSET = 931L;
  public static final long ZIROOM_PROJECT_TRANSFER_RECORD_OFFSET = 932L;

  // 1800-01-01 00:00:00 GMT
  public static final OffsetDateTime PG_MIN_DATE =
      OffsetDateTime.ofInstant(Instant.ofEpochSecond(-5364662400L), ZoneId.systemDefault());
}


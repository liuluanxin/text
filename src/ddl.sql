drop table m_user;
create table m_user
(
    user_id   varchar(6)   not null comment '用户ID',
    user_name varchar(32)  null comment '用户名',
    sex       int          null comment '性别',
    position  int          null comment '职位',
    mail      varchar(128) null comment '邮箱',
    pass_word varchar(128) null comment '密码',
    create_by varchar(32)  null comment '作成者',
    create_at timestamp    null comment '作成时间',
    update_by varchar(32)  null comment '更新者',
    update_at timestamp    null comment '更新时间'
);

drop table m_user_his;
create table m_user_his
(
    user_id                  varchar(6)  not null comment '用户ID'
        primary key,
    last_login_time          timestamp   null comment '最新登录成功时间',
    first_login_failure_time timestamp   null comment '初回登录失败时间',
    login_failure_times      int         null comment '登录失败次数',
    account_lock_time        timestamp   null comment 'アカウントロック時刻',
    login_session_id         varchar(64) null comment 'ログインセッションID',
    create_by                varchar(32) null comment '作成者',
    create_at                timestamp   null comment '作成时间',
    update_by                varchar(32) null comment '更新者',
    update_at                timestamp   null comment '更新时间'
);

drop table m_role;
create table m_role
(
    role_id   varchar(6)  not null comment '用户ID'
        primary key,
    role_name varchar(32) null comment '用户名',
    create_by varchar(32) null comment '作成者',
    create_at timestamp   null comment '作成时间',
    update_by varchar(32) null comment '更新者',
    update_at timestamp   null comment '更新时间'
);

drop table tr_user_role;
create table tr_user_role
(
    user_id   varchar(6)  not null comment '用户ID',
    role_id   varchar(6)  not null comment '用户名',
    create_by varchar(32) null comment '作成者',
    create_at timestamp   null comment '作成时间',
    update_by varchar(32) null comment '更新者',
    update_at timestamp   null comment '更新时间',
    primary key (user_id, role_id)
);

drop table m_project;
create table m_project
(
    project_id         varchar(8)  not null comment '项目ID'
        primary key,
    project_name       varchar(32) null comment '项目名',
    financial_id       varchar(16) null comment '財務ID',
    management_user_id varchar(6)  null comment '主管PM',
    contract_months    int         null comment '受注人月数',
    project_start_date date        null comment '项目开始日',
    project_end_date   date        null comment '项目结束日',
    create_by          varchar(32) null comment '作成者',
    create_at          timestamp   null comment '作成时间',
    update_by          varchar(32) null comment '更新者',
    update_at          timestamp   null comment '更新时间'
);

drop table tr_project_resource;
create table tr_project_resource
(
    project_id varchar(8)  not null comment '项目ID',
    user_id    varchar(6)  not null comment '用户ID',
    start_date date        not null comment '开始日',
    end_date   date        null comment '结束日',
    create_by  varchar(32) null comment '作成者',
    create_at  timestamp   null comment '作成时间',
    update_by  varchar(32) null comment '更新者',
    update_at  timestamp   null comment '更新时间',
    primary key (project_id, user_id, start_date)
);

drop table tr_user_extra_worktime;
create table tr_user_extra_worktime
(
    user_id     varchar(6)    not null comment '用户ID',
    target_date date          not null comment '残业日',
    project_id  varchar(8)    not null comment '项目ID',
    apply_date  date          null comment '申请日',
    time        decimal(4, 2) null comment '残业时间',
    reason      varchar(128)  null comment '残业理由',
    applied     varchar(1)    null comment '申请状态',
    pm_approved varchar(1)    null comment 'PM承认状态',
    dm_approved varchar(1)    null comment 'DM承认状态',
    create_by   varchar(32)   null comment '作成者',
    create_at   timestamp     null comment '作成时间',
    update_by   varchar(32)   null comment '更新者',
    update_at   timestamp     null comment '更新时间',
    primary key (user_id, target_date, project_id)
);

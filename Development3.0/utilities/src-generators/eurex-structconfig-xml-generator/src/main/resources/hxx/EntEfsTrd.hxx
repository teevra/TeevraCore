/* Generated by Xgen from: E90.02.00 on: 2006-02-16 08:30 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntEfsTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter EFS Trade
*
*******************************************************************************/

#ifndef _ENTEFSTRD_HXX_
#define _ENTEFSTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_ENT_EFS_TRD_REQUEST_T_
#define _FUT_BSC_ENT_EFS_TRD_REQUEST_T_

typedef struct futBscEntEfsTrdRequestTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             opnClsCod;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
    char             swapCust1       [SWAP_CUST1_LEN];
    char             swapCust2       [SWAP_CUST2_LEN];
    char             nomVal          [NOM_VAL_LEN];
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             futPrc          [DRIV_PRICE_LEN];
    char             setlDat         [DRIV_DATE_LEN];
    cshLegEfsGrpT    cshLegEfsGrp;
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} futBscEntEfsTrdRequestT, *pFutBscEntEfsTrdRequestT;

#endif  /* _FUT_BSC_ENT_EFS_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EFS_TRD_REQUEST_T_
#define _FUT_ENT_EFS_TRD_REQUEST_T_

typedef struct futEntEfsTrdRequestTag
{
    dataHeaderT      header;
    futBscEntEfsTrdRequestT basic;
} futEntEfsTrdRequestT, *pFutEntEfsTrdRequestT;

#endif  /* _FUT_ENT_EFS_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_EFS_TRD_RESPONSE_T_
#define _FUT_BSC_ENT_EFS_TRD_RESPONSE_T_

typedef struct futBscEntEfsTrdResponseTag
{
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             exchRat         [EXCH_RAT_LEN];
} futBscEntEfsTrdResponseT, *pFutBscEntEfsTrdResponseT;

#endif  /* _FUT_BSC_ENT_EFS_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EFS_TRD_RESPONSE_T_
#define _FUT_ENT_EFS_TRD_RESPONSE_T_

typedef struct futEntEfsTrdResponseTag
{
    dataHeaderT      header;
    futBscEntEfsTrdResponseT basic;
} futEntEfsTrdResponseT, *pFutEntEfsTrdResponseT;

#endif  /* _FUT_ENT_EFS_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTEFSTRD_HXX_ */

/******************************************************************************/
/* End of file EntEfsTrd.hxx */
/******************************************************************************/
